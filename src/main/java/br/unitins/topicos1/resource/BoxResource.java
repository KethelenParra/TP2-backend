package br.unitins.topicos1.resource;
import org.jboss.logging.Logger;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.service.BoxService;
//import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/boxes")
public class BoxResource {
    @Inject
    public BoxService boxService;

    // @Inject
    // public BoxFileServiceImpl fileService;

    private static final Logger LOG = Logger.getLogger(BoxResource.class);

    @GET
    @Path("/{id}")
    //@RolesAllowed({"Funcionario"})
    public Response findById(@PathParam("id") Long id) {
        LOG.info("Executando o findById - BoxResource");
        LOG.infof("Executando o método findById. Id: %s", id.toString());
        return Response.ok(boxService.findById(id)).build();
    }

    @GET
    //@RolesAllowed({"Funcionario", "Cliente"})
    public Response findAll(
        @DefaultValue("0") @QueryParam("page") int page,
        @DefaultValue("100") @QueryParam("pageSize") int pageSize){
        LOG.info("Buscando todos os box - Executando BoxResource_FindAll");
        return Response.ok(boxService.findAll(page, pageSize)).build();
    }

    @GET
    @Path("/search/nome/{nome}")
    //@RolesAllowed({"Funcionario", "Cliente"})
    public Response findByNome(
        @PathParam("nome") String nome,
        @DefaultValue("0") @QueryParam("page") int page,
        @DefaultValue("100") @QueryParam("pageSize") int pageSize){
        LOG.info("Buscando boxes por nonme - Executando BoxResource_findByNome");
        return Response.ok(boxService.findByNome(page, pageSize, nome)).build();
    }

    @GET
    @Path("/search/descricao/{descricao}")
    //@RolesAllowed({"Funcionario", "Cliente"})
    public Response findByDescricao(
        @PathParam("descricao") String descricao,
        @DefaultValue("0") @QueryParam("page") int page,
        @DefaultValue("100") @QueryParam("pageSize") int pageSize){
        LOG.info("Buscando box por descrição - Executando BoxResource_findByDescricao");
        return Response.ok(boxService.findByDescricao(page, pageSize, descricao)).build();
    }

    @GET
    @Path("/search/autor/{autor}")
    //@RolesAllowed({"Funcionario", "Cliente"})
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
    // @RolesAllowed({"Funcionario"})
    public Long count (@PathParam("nome") String nome) {
        LOG.infof("Contando todos os boxes");
        return boxService.countByNome(nome);
    }

    @POST
    //@RolesAllowed({"Funcionario"})
    public Response create (BoxDTO dto){
        try {
            LOG.info("Criando uma nova boxes - Executando BoxResource_create");
            return Response.status(Status.CREATED).entity(boxService.create(dto)).build();
        } catch (Exception e) {
            LOG.error("Erro ao criar uma novo box - Executando BoxResource_create", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao criar uma novo box - Executando BoxResource_create").build();
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

            LOG.error("Erro ao atualizar uma caixa livro - Executando BoxResource_update", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao atualizar um box - Executando BoxResource_update").build();
        }
    }

    @DELETE
    @Path("/{id}")
    //@RolesAllowed({"Funcionario"})
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
    
    // @PATCH
    // @Path("/{id}/image/upload")
    // //@RolesAllowed({"Funcionario"})
    // @Consumes(MediaType.MULTIPART_FORM_DATA)
    // public Response upload(@PathParam("id") Long id, @MultipartForm ImageForm form) {
    //     try {
    //         fileService.salvar(id, form.getNomeImagem(), form.getImagem());
    //         LOG.infof("Imagem salva com sucesso - Executando BoxResource_upload");
    //         return Response.noContent().build();
    //     } catch (Exception e) {
    //         LOG.error("Erro ao salvar imagem da box - Executando BoxResource_upload", e);
    //         return Response.status(Status.CONFLICT).entity("Erro ao salvar imagem da box - Executando BoxResource_upload").build();
    //     }
    // }

    // @GET
    // @Path("/image/download/{nomeImagem}")
    // //@RolesAllowed({"Funcionario"})
    // @Produces(MediaType.APPLICATION_OCTET_STREAM)
    // public Response download(@PathParam("nomeImagem") String nomeImagem) {
    //     try {
            
    //         ResponseBuilder response = Response.ok(fileService.download(nomeImagem));
    //         response.header("Content-Disposition", "attachment;filename=" + nomeImagem);
    //         LOG.infof("Download do arquivo %s concluído com sucesso. - Executando BoxResource_download", nomeImagem);
    //         return response.build();
    //     } catch (Exception e) {
    //         LOG.errorf("Erro ao realizar o download do arquivo:- Executando BoxResource_download %s", nomeImagem, e);

    //         return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    //     }
    // }

}