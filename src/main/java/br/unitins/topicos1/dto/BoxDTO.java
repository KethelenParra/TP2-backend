package br.unitins.topicos1.dto;

import java.util.List;

import br.unitins.topicos1.model.editora.Editora;
import br.unitins.topicos1.model.fornecedor.Fornecedor;

public record BoxDTO(
    String nome,
    String descricaoBox,
    Fornecedor fornecedor,
    Editora editora,
    List<Long> autores,
    List<Long> generos,
    Double preco,
    Integer quantidadeEstoque,
    int classificacao
 
) {}
