package br.unitins.topicos1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record EditoraDTO(
    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    @Size(min = 2, max = 60, message = "O tamanho do nome deve ser entre 2 e 60 caracteres.")
    String nome, 
    @Email(message= "E-mail inválido.")
	@NotEmpty(message = "O E-mail deve ser informado.")
    String email, 
    TelefoneDTO telefone,
    String estado,
    String cidade
) {}
