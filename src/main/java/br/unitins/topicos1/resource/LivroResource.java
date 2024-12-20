package br.unitins.topicos1.resource;

import java.io.IOException;
import java.util.List;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import br.unitins.topicos1.dto.LivroDTO;
import br.unitins.topicos1.form.LivroImageForm;
import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.service.ClienteService;
import br.unitins.topicos1.service.LivroService;
import br.unitins.topicos1.service.file.LivroFileService;
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

@Path("/livros")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LivroResource {

    @Inject
    public LivroService livroService;

    @Inject
    public ClienteService clienteService;
    
    @Inject
    public LivroFileService fileService;

    private static final Logger LOG = Logger.getLogger(LivroResource.class);

    @GET
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response findById(@PathParam("id") Long id){
        LOG.info("Executando o findById");
        LOG.infof("Executando o método findById. Id: %s", id.toString());
        return Response.ok(livroService.findById(id)).build();
    }

    @GET
    public Response findAll(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize
    ){
        LOG.info("Buscando todos os livros - Executando LivroResource_FindAll");
        return Response.ok(livroService.findAll(page, pageSize)).build();
    }

    @GET
    @Path("/search/titulo/{titulo}")
    public Response findByTitulo(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize,
        @PathParam("titulo") String titulo
        ){
        LOG.info("Buscando livros por título - Executando LivroResource_FindByTitulo");
        return Response.ok(livroService.findByTitulo(page, pageSize, titulo)).build();
    }

    @GET
    @Path("/search/isbn/{isbn}")
    public Response findByIsbn(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize,
        @PathParam("isbn") String isbn
        ){
        LOG.info("Buscando livros por ISBN - Executando LivroResource_findByIsbn");
        return Response.ok(livroService.findByIsbn(page, pageSize, isbn)).build();
    }

    @GET
    @Path("/search/descricao/{descricao}")
    public Response findByDescricao(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize,
        @PathParam("descricao") String descricao
        ){
        LOG.info("Buscando livros por descrição - Executando LivroResource_findByDescricao");
        return Response.ok(livroService.findByDescricao(page, pageSize, descricao)).build();
    }

    @GET
    @Path("/search/autor/{autor}")
    public Response findByAutor(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize,
        @PathParam("autor") String autor
        ){
        LOG.info("Buscando livros por autor - Executando LivroResource_findByAutor");
        return Response.ok(livroService.findByAutor(autor)).build();
    }

    @GET
    @Path("/count")
    public long count(){
        LOG.infof("Contando todos os livros");
        return livroService.count();
    }

    @GET
    @Path("/count/search/titulo/{nome}")
    public Long count (@PathParam("nome") String nome) {
        LOG.infof("Contando todos os livros");
        return livroService.countByNome(nome);
    }

    @GET
    @Path("/count/search/autor/{autor}")
    public Long countAutor (@PathParam("autor") String autor) {
        LOG.infof("Contando todos os autores");
        return livroService.countByAutor(autor);
    }

    @POST
    @RolesAllowed({"Funcionario"})
    public Response create (LivroDTO dto){
    
        LOG.info("Criando um novo livro - Executando LivroResource_create");
        return Response.status(Status.CREATED).entity(livroService.create(dto)).build();
       
    }

    @PUT
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response update(@PathParam("id") Long id, LivroDTO dto){
      
        LOG.info("Atualizando um livro - Executando LivroResource_update");
        livroService.update(id, dto);
        return Response.status(Status.NO_CONTENT).build();
       
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response delete(@PathParam("id") Long id){
        try {
            LOG.info("Deletando um livro - Executando LivroResource_delete");
            livroService.delete(id);
            return Response.status(Status.NO_CONTENT).build();
        } catch (Exception e) {
            LOG.error("Erro ao deletar um livro - Executando LivroResource_delete", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao deletar um livro - Executando LivroResource_delete").build();
        }
    }  
    
    @PATCH
    @Path("/image/upload")
    @RolesAllowed({"Funcionario"})
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response salvarImagem(@MultipartForm LivroImageForm form) {
        try {
            fileService.salvar(form.getId(), form.getNomeImagem(), form.getImagem());
            LOG.infof("Imagem salva com sucesso - Executando LivroResource_upload");
            return Response.noContent().build();
        } catch (IOException e) {
            LOG.error("Erro ao salvar imagem do livro - Executando LivroResource_uploar", e);
            return Response.status(Status.CONFLICT).entity("Erro ao salvar imagem do livro - Executando LivroResource_upload").build();
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
    @RolesAllowed({"Funcionario", "Cliente"})
    public Response findWithFilters(
            @QueryParam("autores") List<Long> autores,
            @QueryParam("editoras") List<Long> editoras,
            @QueryParam("generos") List<Long> generos
    ) {
        LOG.info("Buscando livros com filtros:");
        LOG.info("Autores: " + autores);
        LOG.info("Editoras: " + editoras);
        LOG.info("Gêneros: " + generos);
    
        Response response = Response.ok(livroService.findWithFiltersAndRelated(autores, editoras, generos)).build();
        LOG.info("Resposta gerada: " + response.getEntity());
    
        return response;
    }

    @GET
    @Path("/classificacao")
    public Response getClassificacao(){
        return Response.ok(Classificacao.values()).build();
    }

}
