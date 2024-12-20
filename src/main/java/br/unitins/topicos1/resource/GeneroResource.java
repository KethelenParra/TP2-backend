package br.unitins.topicos1.resource;

import org.jboss.logging.Logger;

import br.unitins.topicos1.dto.GeneroDTO;
import br.unitins.topicos1.service.GeneroService;
import jakarta.annotation.security.RolesAllowed;
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
@Path("/generos")
public class GeneroResource {

    @Inject
    public GeneroService generoService;

    private static final Logger LOG = Logger.getLogger(GeneroResource.class);

    @GET
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response findById(@PathParam("id") Long id){
        LOG.info("Executando o findById - Executando GeneroResource_FindById");
        LOG.infof("Executando o método findById. Id: %s", id.toString());
        return Response.ok(generoService.findById(id)).build();
    }

    @GET
    public Response findAll(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize
    ){
        LOG.info("Buscando todos os generos - Executando GeneroResource_FindAll");
        return Response.ok(generoService.findAll(page, pageSize)).build();
    }

    @GET
    @Path("/search/nome/{nome}")
    public Response findByNome(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize,
        @PathParam("nome") String nome
        ){
        LOG.info("Buscando os generos pelo nome - Executando GeneroResource_FindByNome");
        return Response.ok(generoService.findByNome(nome)).build();
    }

    @GET
    @Path("/search/descricao/{descricao}")
    public Response findByDescricao(
        @QueryParam("page") @DefaultValue("0") int page,
        @QueryParam("pageSize") @DefaultValue("100") int pageSize,
        @PathParam("descricao") String descricao
        ){
        LOG.info("Buscando os generos pela descricao - Executando GeneroResource_FindByDescricao");
        return Response.ok(generoService.findByDescricao(descricao)).build();
    }

    @GET
    @Path("/count")
    public long count(){
        LOG.infof("Contando todos os generos");
        return generoService.count();
    }
    
    @GET
    @Path("/count/search/{nome}")
    public Long count (@PathParam("nome") String nome) {
        LOG.infof("Contando todos os generos");
        return generoService.countByNome(nome);
    }

    @POST
    @RolesAllowed({"Funcionario"})
    public Response create (GeneroDTO dto){
      
        LOG.info("Criando um novo genero - Executando GeneroResource_create");
        return Response.status(Status.CREATED).entity(generoService.create(dto)).build();
        
    }

    @PUT
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response update(@PathParam("id") Long id, GeneroDTO dto){
        
        LOG.info("Atualizando um genero - Executando GeneroResource_update");
        generoService.update(id, dto);
        return Response.status(Status.NO_CONTENT).build();
       
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed({"Funcionario"})
    public Response delete(@PathParam("id") Long id){
        try {
            LOG.info("Deletando um genero - Executando GeneroResource_delete");
            generoService.delete(id);
            return Response.status(Status.NO_CONTENT).build();
        } catch (Exception e) {
            LOG.error("Erro ao deletar um genero - Executando GeneroResource_deleta", e);
            return Response.status(Status.NOT_FOUND).entity("Erro ao deletar um genero - Executando GeneroResource_deleta").build();
        }
    }    
}
