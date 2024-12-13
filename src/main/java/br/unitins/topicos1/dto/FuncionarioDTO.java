package br.unitins.topicos1.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public record FuncionarioDTO(
    Double salario,
    String cargo,
    String nome,
    String username,
    LocalDate dataNascimento,
    String email,
    
    @NotBlank(message = "A senha é obrigatória.")
    String senha,
    String cpf,
    Integer idSexo,
    TelefoneDTO telefone
) {}
