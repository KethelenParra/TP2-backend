package br.unitins.topicos1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record FornecedorDTO(
    @NotBlank(message = "O nome não pode ser nulo ou vazio")
    @Size(min = 2, max = 60, message = "O tamanho do nome deve ser entre 2 e 60 caracteres.")
    String nome, 
    @NotBlank(message = "O cnpj não pode ser nulo ou vazio")
    String cnpj, 
    @NotBlank(message = "A inscricao estadual não pode ser nulo ou vazio")
    String inscricaoEstadual, 
    @Email(message= "E-mail inválido.")
	@NotEmpty(message = "O E-mail deve ser informado.")
    String email, 
    String estado, 
    String cidade, 
    TelefoneDTO telefone, 
    @NotNull(message = "O campo quantidade não pode estar nulo")
    Integer quantLivrosFornecido
) {}
