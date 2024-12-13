package br.unitins.topicos1.resource;
import java.util.List;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.form.BoxImageForm;
import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.service.BoxService;
import br.unitins.topicos1.service.file.BoxFileService;
import jakarta.annotation.security.RolesAllowed;
//import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;
import jakarta.ws.rs.core.Response.Status;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/boxes")
public class BoxResource {
    @Inject
    public BoxService boxService;

    @Inject
    public BoxFileService fileService;

    private static final Logger LOG = Logger.getLogger(BoxResource.class);

    @GET
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response findById(@PathParam("id") Long id) {
        LOG.info("Executando o findById - BoxResource");
        LOG.infof("Executando o método findById. Id: %s", id.toString());
        return Response.ok(boxService.findById(id)).build();
    }

    @GET
    public Response findAll(
        @DefaultValue("0") @QueryParam("page") int page,
        @DefaultValue("100") @QueryParam("pageSize") int pageSize){
        LOG.info("Buscando todos os box - Executando BoxResource_FindAll");
        return Response.ok(boxService.findAll(page, pageSize)).build();
    }

    @GET
    @Path("/search/nome/{nome}")
    public Response findByNome(
        @PathParam("nome") String nome,
        @DefaultValue("0") @QueryParam("page") int page,
        @DefaultValue("100") @QueryParam("pageSize") int pageSize){
        LOG.info("Buscando boxes por nonme - Executando BoxResource_findByNome");
        return Response.ok(boxService.findByNome(page, pageSize, nome)).build();
    }

    @GET
    @Path("/search/descricao/{descricao}")
    public Response findByDescricao(
        @PathParam("descricao") String descricao,
        @DefaultValue("0") @QueryParam("page") int page,
        @DefaultValue("100") @QueryParam("pageSize") int pageSize){
        LOG.info("Buscando box por descrição - Executando BoxResource_findByDescricao");
        return Response.ok(boxService.findByDescricao(page, pageSize, descricao)).build();
    }

    @GET
    @Path("/search/autor/{autor}")
    public Response findByAutor(
        @PathParam("autor") String autor,
        @DefaultValue("0") @QueryParam("page") int page,
        @DefaultValue("100") @QueryParam("pageSize") int pageSize){
        LOG.info("Buscando box por autor - Executando BoxResource_findByAutor");
        return Response.ok(boxService.findByAutor(page, pageSize, autor)).build();
    }

    @GET
    @Path("/count")
    public Response count() {
        LOG.infof("Contando todos os boxes");
        return Response.ok(boxService.count()).build();
    }

    @GET
    @Path("/count/search/{nome}")
    public Long count (@PathParam("nome") String nome) {
        LOG.infof("Contando todos os boxes");
        return boxService.countByNome(nome);
    }

    @GET
    @Path("/count/search/autor/{autor}")
    public Long countAutor (@PathParam("autor") String autor) {
        LOG.infof("Contando todos os autores");
        return boxService.countByAutor(autor);
    }

    @POST
    @RolesAllowed({"Funcionario"})
    public Response create (BoxDTO dto){
        
        LOG.info("Criando uma nova boxes - Executando BoxResource_create");
        return Response.status(Status.CREATED).entity(boxService.create(dto)).build();

    }

    @PUT
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response update(@PathParam("id") Long id, BoxDTO dto){
        
        LOG.info("Atualizando um box - Executando BoxResource_update");
        boxService.update(id, dto);
        return Response.status(Status.NO_CONTENT).build();
       
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response delete(@PathParam("id") Long id){
        try {
            LOG.info("Deletando ua box - Executando BoxResource_delete");
            boxService.delete(id);
            return Response.status(Status.NO_CONTENT).build();
        } catch (Exception e) {
            LOG.error("Erro ao deletar um box - Executando BoxResource_delete", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao deletar um box - Executando boxResource_delete").build();
        }
    }  
    
    @PATCH
    @Path("/image/upload")
    @RolesAllowed({"Funcionario"})
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response upload(@MultipartForm BoxImageForm form) {
        try {
            fileService.salvar(form.getId(), form.getNomeImagem(), form.getImagem());
            LOG.infof("Imagem salva com sucesso - Executando BoxResource_upload");
            return Response.noContent().build();
        } catch (Exception e) {
            LOG.error("Erro ao salvar imagem da box - Executando BoxResource_upload", e);
            return Response.status(Status.CONFLICT).entity("Erro ao salvar imagem da box - Executando BoxResource_upload").build();
        }
    }

    @GET
    @Path("/image/download/{nomeImagem}")
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response download(@PathParam("nomeImagem") String nomeImagem) {
        ResponseBuilder response = Response.ok(fileService.download(nomeImagem));
        response.header("Content-Disposition", "attachment;filename=" + nomeImagem);
        return response.build();
    }

    @GET
    @Path("/search/filters")
    public Response findWithFilters(
            @QueryParam("autores") List<Long> autores,
            @QueryParam("editoras") List<Long> editoras,
            @QueryParam("generos") List<Long> generos
    ) {
        LOG.info("Buscando livros com filtros:");
        LOG.info("Autores: " + autores);
        LOG.info("Editoras: " + editoras);
        LOG.info("Gêneros: " + generos);
    
        Response response = Response.ok(boxService.findWithFiltersAndRelated(autores, editoras, generos)).build();
        LOG.info("Resposta gerada: " + response.getEntity());
    
        return response;
    }

    @GET
    @Path("/classificacao")
    public Response getClassificacao(){
        return Response.ok(Classificacao.values()).build();
    }
}