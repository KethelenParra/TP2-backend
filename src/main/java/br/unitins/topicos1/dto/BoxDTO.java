package br.unitins.topicos1.dto;

public record BoxDTO(
    String nome,
    String descricao,
    Integer estoque,
    Long fornecedor
) {}
