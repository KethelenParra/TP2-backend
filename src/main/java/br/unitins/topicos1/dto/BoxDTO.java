package br.unitins.topicos1.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record BoxDTO(
    String nome,
    String descricaoBox,
    Integer quantidadeEstoque,
    Long fornecedor,
    Long editora,

    @NotNull(message = "O campo preço não pode estar nulo")
    @DecimalMin(value = "0")
    Double preco,

    Integer classificacao
    // @NotNull(message = "O campo genero não pode estar vazio")
    // List<Long> generos
    // List<Long> autores,
) {}
