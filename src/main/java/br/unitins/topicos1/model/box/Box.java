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
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Box extends DefaultEntity{

    @Column(nullable = false)
    private String nome;

    @Column(length = 500, nullable = false)
    private String descricaoBox;

    @Column(nullable = false)
    private Integer quantidadeEstoque;

    @Column(nullable = false)
    private Double preco;

    private String nomeImagem;

    private Classificacao classificacao;

    @ManyToOne // Relacionamento com fornecedor
    @JoinColumn(name = "fornecedor_id", nullable = false)
    private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name = "id_editora", nullable = false)
    private Editora Editora;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "box_autor",
        joinColumns = @JoinColumn(name = "idbox"),
        inverseJoinColumns = @JoinColumn(name = "idautor")
    )
    private List<Autor> listaAutor;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "box_genero",
        joinColumns = @JoinColumn(name = "idbox"),
        inverseJoinColumns = @JoinColumn(name = "idgenero")
    )
    private List<Genero> listaGenero;

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

    public String getNomeImagem() {
        return nomeImagem;
    }

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

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

    public List<Autor> getListaAutor() {
        return listaAutor;
    }

    public void setListaAutor(List<Autor> listaAutor) {
        this.listaAutor = listaAutor;
    }

    public List<Genero> getListaGenero() {
        return listaGenero;
    }

    public void setListaGenero(List<Genero> listaGenero) {
        this.listaGenero = listaGenero;
    }

}
