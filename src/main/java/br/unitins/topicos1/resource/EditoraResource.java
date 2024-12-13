package br.unitins.topicos1.resource;

import java.io.IOException;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import br.unitins.topicos1.dto.EditoraDTO;
import br.unitins.topicos1.form.EditoraImageForm;
import br.unitins.topicos1.service.EditoraService;
import br.unitins.topicos1.service.file.EditoraFileService;
import jakarta.annotation.security.RolesAllowed;
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
@Path("/editoras")
public class EditoraResource {

    @Inject
    public EditoraService editoraService;

     @Inject
    public EditoraFileService fileService;

    private static final Logger LOG = Logger.getLogger(EditoraResource.class);

    @GET
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response findById(@PathParam("id") Long id){
        LOG.info("Buscando editora por id: - Executando EditoraResource_FindById" + id);
        return Response.ok(editoraService.findById(id)).build();
    }

    @GET
    public Response findAll(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize
    ){
        LOG.info("Buscando todas as editoras - Executando EditoraResource_Findall");
        return Response.ok(editoraService.findAll(page, pageSize)).build();
    }

    @GET
    @Path("/search/nome/{nome}")
    public Response findByNome(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize,
        @PathParam("nome") String nome
        ){
        LOG.info("Buscando editora por nome: - Executando EditoraResource_FindByNome" + nome);
        return Response.ok(editoraService.findByNome(page, pageSize, nome)).build();
    }


    @POST
    @RolesAllowed({"Funcionario"})
    public Response create (EditoraDTO dto){
        
        LOG.info("Editora criado com sucesso - Executando EditoraResource_create");
        return Response.status(Status.CREATED).entity(editoraService.create(dto)).build();
    }

    @PUT
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response update(@PathParam("id") Long id, EditoraDTO dto){
        
        LOG.info("Editora atualizado com sucesso - Executando EditoraResource_update");
        editoraService.update(id, dto);
        return Response.status(Status.NO_CONTENT).build();
      
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response delete(@PathParam("id") Long id){
        try {
            LOG.info("Editora deletado com sucesso - Executando EditoraResource_delete");
            editoraService.delete(id);
            return Response.status(Status.NO_CONTENT).build();
        } catch (Exception e) {
            LOG.error("Erro ao deletar editora - Executando EditoraResource_delete", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao deletar editora - Executando EditoraResource_delete").build();
        }
    }    

    @GET
    @Path("/count")
    public long count(){
        LOG.infof("Contando todos os editoras");
        return editoraService.count();
    }

    @GET
    @Path("/count/search/{nome}")
    public Long count (@PathParam("nome") String nome) {
        LOG.infof("Contando todos os editoras");
        return editoraService.countByNome(nome);
    }

    @PATCH
    @Path("/image/upload")
    @RolesAllowed({"Funcionario"})
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response salvarImagem(@MultipartForm EditoraImageForm form) {
        try {
            fileService.salvar(form.getId(), form.getNomeImagem(), form.getImagem());
            LOG.infof("Imagem salva com sucesso - Executando EditoraResource_upload");
            return Response.noContent().build();
        } catch (IOException e) {
            LOG.error("Erro ao salvar imagem do livro - Executando EditoraResource_upload", e);
            return Response.status(Status.CONFLICT).entity("Erro ao salvar imagem do editora - Executando AutorResource_upload").build();
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
}
