package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.pedido.ItemPedido;

public record ItemPedidoResponseDTO(
    Long id,
    String titulo,
    Double preco,
    Integer quantidade,
    String desconto,
    String subTotal
) {
    public static ItemPedidoResponseDTO valueOf(ItemPedido item) {
        if (item.getLivro() != null) {
            // Caso seja um Livro
            return new ItemPedidoResponseDTO(
                item.getLivro().getId(),
                item.getLivro().getTitulo(),
                item.getLivro().getPreco(),
                item.getQuantidade(),
                "R$" + String.format("%.2f", item.getDesconto()),
                "R$" + String.format("%.2f", item.getSubTotal())
            );
        } else if (item.getBox() != null) {
            // Caso seja um Box
            return new ItemPedidoResponseDTO(
                item.getBox().getId(),
                item.getBox().getNome(),
                item.getBox().getPreco(),
                item.getQuantidade(),
                "R$" + String.format("%.2f", item.getDesconto()),
                "R$" + String.format("%.2f", item.getSubTotal())
            );
        } else {
            throw new IllegalStateException("ItemPedido não possui Livro ou Box associado.");
        }
    }
}
