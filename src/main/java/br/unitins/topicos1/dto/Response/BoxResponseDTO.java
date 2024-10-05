package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.box.Box;

public record BoxResponseDTO(
    Long id,
    String nome,
    String descricao,
    Integer estoque,
    FornecedorResponseDTO fornecedor
) {
    public static BoxResponseDTO valueof(Box box){

        return new BoxResponseDTO(
            box.getId(), 
            box.getNome(), 
            box.getDescricaoBox(),
            box.getQuantidadeEstoque(),
            FornecedorResponseDTO.valueOf(box.getFornecedor())
        );
    }
}
