package br.unitins.topicos1.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EnderecoDTO(
    String cep,
    String logradouro,
    String complemento,
    String bairro,
    String localidade,
    String uf
) {}
