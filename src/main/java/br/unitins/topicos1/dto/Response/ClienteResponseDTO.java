package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.Pessoa.Cliente;

public record ClienteResponseDTO(
    Long id,
    UsuarioResponseDTO usuario,
    String cep,
    String logradouro,
    String complemento,
    String bairro,
    String localidade,
    String uf
) {
    public static ClienteResponseDTO valueOf(Cliente cliente){
        return new ClienteResponseDTO(
            cliente.getId(),
            UsuarioResponseDTO.valueOf(cliente.getUsuario()),
            cliente.getCep(),
            cliente.getLogradouro(),
            cliente.getComplemento(),
            cliente.getBairro(),
            cliente.getLocalidade(),
            cliente.getUf());
    }
}
