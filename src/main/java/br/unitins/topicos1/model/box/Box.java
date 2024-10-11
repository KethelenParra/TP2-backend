package br.unitins.topicos1.model.box;
import java.util.List;

import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.model.autor.Autor;
import br.unitins.topicos1.model.defaultEntity.DefaultEntity;
import br.unitins.topicos1.model.editora.Editora;
import br.unitins.topicos1.model.fornecedor.Fornecedor;
import br.unitins.topicos1.model.genero.Genero;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Box extends DefaultEntity{

    @Column(nullable = false)
    private String nome;

    @Column(length = 20000, nullable = false)
    private String descricaoBox;

    @Column(nullable = false)
    private Integer quantidadeEstoque;

    @Column(nullable = false)
    private Double preco;

    // private String nomeImagem;

    private Classificacao classificacao;
    
    @ManyToOne 
    @JoinColumn(name = "id_fornecedor", nullable = false)
    private Fornecedor fornecedor;
    
    @ManyToOne
    @JoinColumn(name = "id_editora", nullable = false)
    private Editora Editora;

    @ManyToMany
    @JoinTable(
        name = "box_genero",
        joinColumns = @JoinColumn(name = "idbox"),
        inverseJoinColumns = @JoinColumn(name = "idgenero")
    )
    private List<Genero> listaGeneros;

    @ManyToMany
    @JoinTable(
        name = "box_autor",
        joinColumns = @JoinColumn(name = "idbox"),
        inverseJoinColumns = @JoinColumn(name = "idautor")
    )
    private List<Autor> listaAutor;

     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoBox() {
        return descricaoBox;
    }

    public void setDescricaoBox(String descricaoBox) {
        this.descricaoBox = descricaoBox;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // // public String getNomeImagem() {
    // //     return nomeImagem;
    // // }

    // // public void setNomeImagem(String nomeImagem) {
    // //     this.nomeImagem = nomeImagem;
    // // }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Editora getEditora() {
        return Editora;
    }

    public void setEditora(Editora editora) {
        Editora = editora;
    }

    public List<Genero> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(List<Genero> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }

    public List<Autor> getListaAutor() {
        return listaAutor;
    }

    public void setListaAutor(List<Autor> listaAutor) {
        this.listaAutor = listaAutor;
    }
}
