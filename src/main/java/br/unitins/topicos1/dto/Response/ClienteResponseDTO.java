package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.Pessoa.Cliente;

public record ClienteResponseDTO(
    Long id,
       UsuarioResponseDTO usuario
) {
    public static ClienteResponseDTO valueOf(Cliente cliente){
        return new ClienteResponseDTO(
            cliente.getId(),
            UsuarioResponseDTO.valueOf(cliente.getUsuario()));
    }
}
