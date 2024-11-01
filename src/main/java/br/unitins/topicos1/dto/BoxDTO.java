package br.unitins.topicos1.dto;

import java.util.List;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record BoxDTO(
    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    @Size(min = 2, max = 60, message = "O tamanho do nome deve ser entre 2 e 60 caracteres.")
    String nome,
    @NotBlank(message = "A descricao não pode ser nula ou vazio") 
    @Size(min = 10, max = 20000, message = "O tamanho da descricao deve ser entre 10 e 20000 caracteres.")
    String descricaoBox,
    @NotNull(message = "O campo quantidade não pode estar nulo")
    Integer quantidadeEstoque,
    @NotNull(message = "O campo editora não pode estar nulo")
    Long fornecedor,
    @NotNull(message = "O campo editora não pode estar nulo")
    Long editora,

    @NotNull(message = "O campo preço não pode estar nulo")
    @DecimalMin(value = "0")
    Double preco,

    Integer classificacao,
    @NotNull(message = "O campo generos não pode estar nulo")
    List<Long> generos,
    @NotNull(message = "O campo autores não pode estar nulo")
    List<Long> autores
) {}
