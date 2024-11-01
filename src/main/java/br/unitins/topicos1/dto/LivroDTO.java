package br.unitins.topicos1.dto;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LivroDTO(
        @NotBlank(message = "O nome não pode ser nulo ou vazio")
        @Size(min = 2, max = 60, message = "O tamanho do nome deve ser entre 2 e 60 caracteres.")
        String titulo,
        @NotNull(message = "O campo quantidade não pode estar nulo")
        Integer quantidadeEstoque,

        @NotNull(message = "O campo preço não pode estar nulo")
        @DecimalMin(value = "0")
        Double preco,
        @NotBlank(message = "O ISBN não pode ser nulo ou vazio")
        @Size(min = 13, max = 13, message = "O tamanho do ISBN deve ter 13 caracteres.")
        String isbn,
        @NotBlank(message = "a descricao não pode ser nulo ou vazio")
        @Size(min = 10, max = 20000, message = "O tamanho da descricao deve ser entre 10 e 20000 caracteres.")
        String descricao,
        @NotNull(message = "O campo data lancamento não pode estar nulo")
        LocalDate datalancamento,
        @NotNull(message = "O campo classificacao não pode estar nulo")
        Integer classificacao,
        @NotNull(message = "O campo editora não pode estar nulo")
        Long editora,
        @NotNull(message = "O campo fornecedor não pode estar nulo")
        Long fornecedor,
        @NotNull(message = "O campo generos não pode estar nulo")
        List<Long> generos,
        @NotNull(message = "O campo autores não pode estar nulo")
        List<Long> autores
) { }
