package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.model.livro.Livro;

public record LivroResponseDTO(
        Long id,
        String titulo,
        Integer quantidadeEstoque,
        Double preco,
        String isbn,
        String descricao,
        Classificacao classificacao,
        EditoraResponseDTO editora,
        FornecedorResponseDTO fornecedor 
        //String datalancamento,
        // List<AutorResponseDTO> autores,
        // List<GeneroResponseDTO> generos,
        //String nomeImagem
) {
    //private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static LivroResponseDTO valueOf(Livro livro) {
                        // List<AutorResponseDTO> listaAutor = livro.getListaAutor()
                        //                         .stream()
                        //                         .map(AutorResponseDTO::valueOf)
                        //                         .toList();
                        // List<GeneroResponseDTO> listaGenero = livro.getListaGenero()
                        //                         .stream()
                        //                         .map(GeneroResponseDTO::valueOf)
                        //                         .toList();
        return new LivroResponseDTO(
                livro.getId(),
                livro.getTitulo(),
                livro.getQuantidadeEstoque(),
                livro.getPreco(),
                livro.getIsbn(),
                livro.getDescricao(),
                livro.getClassificacao(),
                EditoraResponseDTO.valueOf(livro.getEditora()),
                FornecedorResponseDTO.valueOf(livro.getFornecedor())
                //listaAutor,
                //listaGenero,
                //livro.getDatalancamento().format(formatter),
                //livro.getNomeImagem()
        );
    }
}
