package br.unitins.topicos1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AutorDTO (
    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    @Size(min = 2, max = 60, message = "O tamanho do nome deve ser entre 2 e 60 caracteres.")
    String nome,
    @NotBlank(message = "A biografia não pode ser nula ou vazio") 
    @Size(min = 10, max = 10000, message = "O tamanho do nome deve ser entre 10 e 10000 caracteres.")
    String biografia
    ) {}
