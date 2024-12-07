
package br.unitins.topicos1.dto.Response;

import java.util.List;
import br.unitins.topicos1.model.Pessoa.ItemDesejo;

public record ItemDesejoResponseDTO(
    Long id,
    String nome,
    String tipo,
    List<AutorResponseDTO> autores,
    String imagemUrl
) {
    public static ItemDesejoResponseDTO valueOf(ItemDesejo item) {
        if (item.getLivro() != null) {
            return new ItemDesejoResponseDTO(
                item.getId(),
                item.getLivro().getTitulo(),
                "Livro",
                item.getLivro().getListaAutor() != null
                    ? item.getLivro().getListaAutor().stream()
                        .map(AutorResponseDTO::valueOf)
                        .toList()
                    : List.of(), // Verifica se a lista de autores é nula
                item.getLivro().getNomeImagem() // Retorna o nome da imagem do livro
            );
        } else if (item.getBox() != null) {
            return new ItemDesejoResponseDTO(
                item.getId(),
                item.getBox().getNome(),
                "Box",
                item.getBox().getListaAutor() != null
                    ? item.getBox().getListaAutor().stream()
                        .map(AutorResponseDTO::valueOf)
                        .toList()
                    : List.of(), // Verifica se a lista de autores é nula
                item.getBox().getNomeImagem() // Retorna o nome da imagem do box
            );
        }
        throw new IllegalArgumentException("Item inválido, sem Livro ou Box associado.");
    }
}
