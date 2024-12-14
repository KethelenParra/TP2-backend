package br.unitins.topicos1.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
    @NotNull(message = "O campo sexo não pode estar nulo.")
    Integer idSexo,
    TelefoneDTO telefone
) {}
