package br.unitins.topicos1.dto.Response;

public record EnderecoResponseDTO (
    String cep,
    String logradouro,
    String complemento,
    String bairro,
    String localidade,
    String uf
) {
 
}
