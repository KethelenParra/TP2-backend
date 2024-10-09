package br.unitins.topicos1.resource;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.form.ImageForm;
import br.unitins.topicos1.service.BoxService;
import br.unitins.topicos1.service.file.LivroFileServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;
import jakarta.ws.rs.core.Response.Status;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/boxes")
public class BoxResource {
    
    @Inject
    private BoxService boxService;

    @Inject
    public LivroFileServiceImpl fileService;

    private static final Logger LOG = Logger.getLogger(BoxResource.class);

    @GET
    @Path("/{id}")
    //@RolesAllowed({"Funcionario"})
    public Response findById(@PathParam("id") Long id){
        LOG.info("Executando o findById");
        LOG.infof("Executando o método findById. Id: %s", id.toString());
        return Response.ok(boxService.findById(id)).build();
    }

    @GET
    //@RolesAllowed({"Funcionario", "Cliente"})
    public Response findAll(){
        LOG.info("Buscando todos os boxes - Executando BoxResource_FindAll");
        return Response.ok(boxService.findAll()).build();
    }

    @GET
    @Path("/search/nome/{nome}")
    //@RolesAllowed({"Funcionario", "Cliente"})
    public Response findByNome(@PathParam("nome") String nome){
        LOG.info("Buscando box por título - Executando BoxResource_FindByNome");
        return Response.ok(boxService.findByNome(nome)).build();
    }

    // @GET
    // @Path("/search/autor/{autor}")
    // //@RolesAllowed({"Funcionario", "Cliente"})
    // public Response findByAutor(@PathParam("autor") String autor){
    //     LOG.info("Buscando Box por autor - Executando LivroResource_findByAutor");
    //     return Response.ok(boxService.findByAutor(autor)).build();
    // }

    @POST
    //@RolesAllowed({"Funcionario"})
    public Response create (BoxDTO dto){
        try {
            LOG.info("Criando um novo box - Executando BoxResource_create");
            return Response.status(Status.CREATED).entity(boxService.create(dto)).build();
        } catch (Exception e) {
            LOG.error("Erro ao criar um novo box - Executando BoxResource_create", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao criar um novo box - Executando BoxResource_create").build();
        }
    }

    @PUT
    @Path("/{id}")
    //@RolesAllowed({"Funcionario"})
    public Response update(@PathParam("id") Long id, BoxDTO dto){
        try {
            LOG.info("Atualizando um box - Executando BoxResource_update");
            boxService.update(id, dto);
            return Response.status(Status.NO_CONTENT).build();
        } catch (Exception e) {
            LOG.error("Erro ao atualizar um box - Executando BoxResource_update", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao atualizar um box - Executando BoxResource_update").build();
        }
    }

    @DELETE
    @Path("/{id}")
    //@RolesAllowed({"Funcionario"})
    public Response delete(@PathParam("id") Long id){
        try {
            LOG.info("Deletando um box - Executando BoxResource_delete");
            boxService.delete(id);
            return Response.status(Status.NO_CONTENT).build();
        } catch (Exception e) {
            LOG.error("Erro ao deletar um box - Executando BoxResource_delete", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao deletar um box - Executando BoxResource_delete").build();
        }
    }  

    @PATCH
    @Path("/{id}/image/upload")
    //@RolesAllowed({"Funcionario"})
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response upload(@PathParam("id") Long id, @MultipartForm ImageForm form) {
        try {
            fileService.salvar(id, form.getNomeImagem(), form.getImagem());
            LOG.infof("Imagem salva com sucesso - Executando LivroResource_upload");
            return Response.noContent().build();
        } catch (Exception e) {
            LOG.error("Erro ao salvar imagem do livro - Executando LivroResource_uploar", e);
            return Response.status(Status.CONFLICT).entity("Erro ao salvar imagem do livro - Executando LivroResource_upload").build();
        }
    }

    @GET
    @Path("/image/download/{nomeImagem}")
    //@RolesAllowed({"Funcionario"})
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response download(@PathParam("nomeImagem") String nomeImagem) {
        try {
            
            ResponseBuilder response = Response.ok(fileService.download(nomeImagem));
            response.header("Content-Disposition", "attachment;filename=" + nomeImagem);
            LOG.infof("Download do arquivo %s concluído com sucesso. - Executando LivroResource_download", nomeImagem);
            return response.build();
        } catch (Exception e) {
            LOG.errorf("Erro ao realizar o download do arquivo:- Executando LivroResource_download %s", nomeImagem, e);

            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}
