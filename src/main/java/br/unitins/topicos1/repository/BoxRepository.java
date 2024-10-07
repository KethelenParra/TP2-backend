package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.box.Box;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BoxRepository implements PanacheRepository<Box> {
    public List<Box> findByBox(String nome){
        return find("UPPER(nome) LIKE ?1", nome.toUpperCase() + "%").list();
    }

    public List<Box> findByAutor(String autor){
        return find("SELECT box FROM Box box JOIN box.listaAutor autor WHERE UPPER(autor.nome) LIKE ?1", autor.toUpperCase() + "%").list();
    }

    public Box findByNomeBox(String nome) {
        return find("UPPER(nome) = ?1",  "%" + nome.toUpperCase()  + "%").firstResult();
    }
}
