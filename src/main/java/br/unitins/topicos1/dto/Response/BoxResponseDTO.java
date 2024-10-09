package br.unitins.topicos1.dto.Response;


import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.model.box.Box;

public record BoxResponseDTO(
    Long id,
    String nome,
    String descricaoBox,
    Integer quantidadeEstoque,
    FornecedorResponseDTO fornecedor,
    EditoraResponseDTO editora,
    Double preco,
    Classificacao classificacao // Renomeei para ficar consistente
    // List<GeneroResponseDTO> generos
    // List<AutorResponseDTO> autores
   //String nomeImagem
) {
    public static BoxResponseDTO valueOf(Box box){
        // List<GeneroResponseDTO> listaGenero = box.getListaGeneros()
        //                                         .stream()
        //                                         .map(GeneroResponseDTO::valueOf)
        //                                         .toList();

        // Transformar listas de autores e gêneros em suas respectivas DTOs
        // List<AutorResponseDTO> listaAutor = box.getListaAutor()
        //                                         .stream()
        //                                         .map(AutorResponseDTO::valueOf)
        //                                         .toList();     
        return new BoxResponseDTO(
            box.getId(),
            box.getNome(),
            box.getDescricaoBox(),
            box.getQuantidadeEstoque(),
            FornecedorResponseDTO.valueOf(box.getFornecedor()),  // Relacionamento com fornecedor
            EditoraResponseDTO.valueOf(box.getEditora()),  // Relacionamento com editora
            box.getPreco(), // Formatação de preço
            box.getClassificacao()  // Classificação
            // listaGenero  // Lista de gêneros
            // listaAutor,  // Lista de autores
            //box.getNomeImagem()  // Nome da imagem
        );
    }
}
