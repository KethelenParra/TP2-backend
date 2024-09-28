package br.unitins.topicos1.resource.pessoa;

import br.unitins.topicos1.dto.Response.EnderecoResponseDTO;
import br.unitins.topicos1.service.ApiCepService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

@Path("/enderecos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EnderecoResource {

    @Inject
    ApiCepService apiCepService;

    @GET
    @Path("/{cep}")
    @Operation(summary = "Obter endereço pelo CEP", description = "Retorna os detalhes do endereço com base no CEP fornecido.")
    public Response getEndereco(
            @Parameter(description = "CEP do endereço", required = true)
            @PathParam("cep") String cep) {
        try {
            EnderecoResponseDTO enderecoResponseDTO = apiCepService.getEndereco(cep);
            return Response.ok(enderecoResponseDTO).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao buscar o endereço: " + e.getMessage()).build();
        }
    }
}
