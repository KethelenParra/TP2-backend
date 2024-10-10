package br.unitins.topicos1.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record LivroDTO(
        String titulo,
        Integer quantidadeEstoque,

        @NotNull(message = "O campo preço não pode estar nulo")
        @DecimalMin(value = "0")
        Double preco,
        String isbn,
        String descricao,
        Integer classificacao,
        Long editora,
        Long fornecedor
        // LocalDate datalancamento,
        // List<Long> generos,
        // List<Long> autores,
) { }
