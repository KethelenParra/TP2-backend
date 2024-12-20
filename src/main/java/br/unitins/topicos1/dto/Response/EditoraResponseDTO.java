package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.editora.Editora;

public record EditoraResponseDTO(
    Long id,  
    String nome, 
    String email, 
    String estado,
    String cidade,
    TelefoneResponseDTO telefone,
    String nomeImagem
) {
    public static EditoraResponseDTO valueOf(Editora editora){
        return new EditoraResponseDTO(
            editora.getId(),
            editora.getNome(),
            editora.getEmail(),
            editora.getEstado(),
            editora.getCidade(),
            TelefoneResponseDTO.valueOf(editora.getTelefone()),
            editora.getNomeImagem()
        );
    }
}
