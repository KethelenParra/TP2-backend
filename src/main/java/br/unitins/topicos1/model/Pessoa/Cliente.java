package br.unitins.topicos1.model.Pessoa;

import java.util.List;


import br.unitins.topicos1.model.defaultEntity.DefaultEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cliente extends DefaultEntity {
    
    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemDesejo> listaDesejo;

    public List<ItemDesejo> getListaDesejo() {
        return listaDesejo;
    }

    public void setListaDesejo(List<ItemDesejo> listaDesejo) {
        this.listaDesejo = listaDesejo;
    }

    // @ManyToMany(fetch = FetchType.EAGER)
    // @JoinTable(name = "lista_desejo",
    //             joinColumns = @JoinColumn(name = "id_cliente"),
    //             inverseJoinColumns = @JoinColumn(name = "id_livro"))
    // private List<Livro> listaDesejo;

    // @ManyToMany(fetch = FetchType.EAGER)
    // @JoinTable(name = "lista_desejo_box",
    //             joinColumns = @JoinColumn(name = "id_cliente"),
    //             inverseJoinColumns = @JoinColumn(name = "id_box"))
    // private List<Box> listaDesejoBox;
    
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getLocalidade() {
        return localidade;
    }
    
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    // public List<Livro> getListaDesejo() {
    //     return listaDesejo;
    // }
    
    // public void setListaDesejo(List<Livro> listaDesejo) {
    //     this.listaDesejo = listaDesejo;
    // }

    // public List<Box> getListaDesejoBox() {
    //     return listaDesejoBox;
    // }

    // public void setListaDesejoBox(List<Box> listaDesejoBox) {
    //     this.listaDesejoBox = listaDesejoBox;
    // }
}