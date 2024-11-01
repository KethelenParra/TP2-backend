package br.unitins.topicos1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record GeneroDTO(

    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    @Size(min = 2, max = 60, message = "O tamanho do nome deve ser entre 2 e 60 caracteres.")
    String nome, 
	@NotEmpty(message = "A descrição deve ser informada.")
    @NotBlank(message = "A descrocao não pode ser nulo ou vazio")
    @Size(min = 10, max = 10000, message = "O tamanho da descricao deve ser entre 10 e 10000 caracteres.")
    String descricao
) {}
