package br.unitins.topicos1.dto.Response;

import java.util.List;

import br.unitins.topicos1.model.box.Box;

public record BoxResponseDTO(
    Long id,
    String nome,
    String descricaoBox,
    FornecedorResponseDTO fornecedor,
    List<AutorResponseDTO> autores,
    EditoraResponseDTO editora,
    List<GeneroResponseDTO> generos,
    Double preco,
    String quantidadeEstoque, // Aqui você passa o status do estoque como string
    String classificacao
    // String nomeImagem
) {
    public static BoxResponseDTO valueOf(Box box){
        // Transformar listas de autores e gêneros em suas respectivas DTOs
        List<AutorResponseDTO> listaAutor = box.getListaAutor()
                                                .stream()
                                                .map(AutorResponseDTO::valueOf)
                                                .toList();

        List<GeneroResponseDTO> listaGenero = box.getListaGenero()
                                                .stream()
                                                .map(GeneroResponseDTO::valueOf)
                                                .toList();
        
        // Avaliar o status do estoque
        String statusEstoque = box.getQuantidadeEstoque() > 0 ? "Disponível" : "Estoque esgotado";

        String classificacaoDescricao = box.getClassificacao().getDescricao();

        // Construir o DTO
        return new BoxResponseDTO(
            box.getId(),
            box.getNome(),
            box.getDescricaoBox(),
            FornecedorResponseDTO.valueOf(box.getFornecedor()),  // Relacionamento com fornecedor
            listaAutor,  // Lista de autores
            EditoraResponseDTO.valueOf(box.getEditora()),  // Relacionamento com editora
            listaGenero,  // Lista de gêneros
            box.getPreco(),  // Formatação de preço
            statusEstoque,  // Status de estoque calculado
            classificacaoDescricao
            // box.getNomeImagem()  // Nome da imagem
        );
    }
}
