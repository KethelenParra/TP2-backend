package br.unitins.topicos1.dto.Response;

import java.util.List;

import br.unitins.topicos1.model.Pessoa.Cliente;

public record ClienteResponseDTO(
    Long id,
    UsuarioResponseDTO usuario,
    List<ItemDesejoResponseDTO> listaDesejo,
    String cep,
    String logradouro,
    String complemento,
    String bairro,
    String localidade,
    String uf
) {
    public static ClienteResponseDTO valueOf(Cliente cliente) {
        return new ClienteResponseDTO(
            cliente.getId(),
            UsuarioResponseDTO.valueOf(cliente.getUsuario()),
            cliente.getListaDesejo()
                    .stream()
                    .map(ItemDesejoResponseDTO::valueOf)
                    .toList(),
            cliente.getCep(),
            cliente.getLogradouro(),
            cliente.getComplemento(),
            cliente.getBairro(),
            cliente.getLocalidade(),
            cliente.getUf()
        );
    }
}
