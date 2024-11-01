package br.unitins.topicos1.repository;

import br.unitins.topicos1.model.box.Box;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BoxRepository implements PanacheRepository<Box> {
    public PanacheQuery<Box> findByBox(String nome){
        return find("UPPER(nome) LIKE ?1",  "%" + nome.toUpperCase() + "%");
    }

    public PanacheQuery<Box> findByDescricao(String descricaoBox){
        return find("UPPER(descricaoBox) LIKE ?1", descricaoBox.toUpperCase() + "%");
    }

    public PanacheQuery<Box> findByAutor(String autor){
        return find("SELECT box FROM Box box JOIN box.listaAutor autor WHERE UPPER(autor.nome) LIKE ?1", autor.toUpperCase() + "%");
    }
    
    public Box findByNomeBox(String nome) {
        return find("UPPER(nome) = ?1",  nome.toUpperCase() ).firstResult();
    }

}
