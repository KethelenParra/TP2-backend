package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.fornecedor.Fornecedor;

public record FornecedorResponseDTO(
    Long id,  
    String nome, 
    String cnpj, 
    String inscricaoEstadual, 
    String email, 
    Integer quantLivrosFornecido,
    TelefoneResponseDTO telefone
) {
    public static FornecedorResponseDTO valueOf(Fornecedor fornecedor){
        return new FornecedorResponseDTO(
            fornecedor.getId(),
            fornecedor.getNome(),
            fornecedor.getCnpj(),
            fornecedor.getInscricaoEstadual(),
            fornecedor.getEmail(),
            fornecedor.getQuantLivrosFornecido(),
            TelefoneResponseDTO.valueOf(fornecedor.getTelefone())
        );
    }
}
