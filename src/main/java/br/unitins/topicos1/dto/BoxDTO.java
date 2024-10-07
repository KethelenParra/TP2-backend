package br.unitins.topicos1.dto;

import java.util.List;

public record BoxDTO(
    String nome,
    String descricaoBox,
    Long fornecedor,
    List<Long> autores,
    Long editora,
    List<Long> generos,
    Double preco,
    Integer quantidadeEstoque,
    Integer id_classificacao
 
) {}
