package br.unitins.topicos1.dto.Response;

import java.time.format.DateTimeFormatter;
import java.util.List;
import br.unitins.topicos1.model.livro.Livro;

public record LivroResponseDTO(
        Long id,
        String titulo,
        List<AutorResponseDTO> autores,
        EditoraResponseDTO editora,
        List<GeneroResponseDTO> generos,
        Double preco,
        String quantidadeEstoque,
        String isbn,
        String datalancamento,
        String classificacao,
        String descricao,
        FornecedorResponseDTO fornecedor, 
        String nomeImagem
) {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static LivroResponseDTO valueOf(Livro livro) {
                        List<AutorResponseDTO> listaAutor = livro.getListaAutor()
                                                .stream()
                                                .map(AutorResponseDTO::valueOf)
                                                .toList();
                        List<GeneroResponseDTO> listaGenero = livro.getListaGenero()
                                                .stream()
                                                .map(GeneroResponseDTO::valueOf)
                                                .toList();
        return new LivroResponseDTO(
                livro.getId(),
                livro.getTitulo(),
                listaAutor,
                EditoraResponseDTO.valueOf(livro.getEditora()),
                listaGenero,
                livro.getPreco(),
                livro.getQuantidadeEstoque() > 0 ? "Disponível" : "Estoque esgotado",
                livro.getIsbn(),
                livro.getDatalancamento().format(formatter),
                livro.getClassificacao().getDescricao(),
                livro.getDescricao(),
                FornecedorResponseDTO.valueOf(livro.getFornecedor()),
                livro.getNomeImagem());
    }
}
