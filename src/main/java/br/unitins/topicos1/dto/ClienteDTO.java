package br.unitins.topicos1.dto;

import java.time.LocalDate;

public record ClienteDTO(
    
    String nome,
    String username,
    LocalDate dataNascimento,
    String email,
    String senha,
    String cpf,
    Integer idSexo,
    TelefoneDTO telefone
) { }
