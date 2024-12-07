package br.unitins.topicos1.model.Pessoa;

import br.unitins.topicos1.model.box.Box;
import br.unitins.topicos1.model.defaultEntity.DefaultEntity;
import br.unitins.topicos1.model.livro.Livro;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemDesejo extends DefaultEntity {

    @ManyToOne
    @JoinColumn(name = "id_livro", nullable = true)
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "id_box", nullable = true)
    private Box box;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
