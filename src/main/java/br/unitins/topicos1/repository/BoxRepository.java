package br.unitins.topicos1.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public PanacheQuery<Box> findWithFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        StringBuilder query = new StringBuilder("SELECT DISTINCT b FROM Box b ");
        Map<String, Object> params = new HashMap<>();
    
        boolean whereAdded = false;
    
        if (autores != null && !autores.isEmpty()) {
            query.append("JOIN b.listaAutor autor ");
            query.append(whereAdded ? "AND " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
    
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("b.editora.id IN (:editoras) ");
            params.put("editoras", editoras);
            whereAdded = true;
        }
    
        if (generos != null && !generos.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ")
                 .append("EXISTS (SELECT 1 FROM b.listaGeneros genero WHERE genero.id IN (:generos)) ");
            params.put("generos", generos);
        }
    
        return find(query.toString(), params);
    }    
   
    public List<Long> findEditorasByFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        StringBuilder query = new StringBuilder("SELECT DISTINCT b.editora.id FROM Box b ");
        Map<String, Object> params = new HashMap<>();
    
        boolean whereAdded = false;
    
        if (autores != null && !autores.isEmpty()) {
            query.append("JOIN b.listaAutor autor ");
            query.append(whereAdded ? "OR " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "OR " : "WHERE ").append("b.editora.id IN (:editoras) ");
            params.put("editoras", editoras);
            whereAdded = true;
        }
        if (generos != null && !generos.isEmpty()) {
            query.append(whereAdded ? "OR " : "WHERE ")
                 .append("EXISTS (SELECT 1 FROM b.listaGeneros genero WHERE genero.id IN (:generos)) ");
            params.put("generos", generos);
        }
    
        return find(query.toString(), params).project(Long.class).list();
    }
    

    public List<Long> findGenerosByFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        StringBuilder query = new StringBuilder("SELECT DISTINCT g.id FROM Box b JOIN b.listaGeneros g ");
        Map<String, Object> params = new HashMap<>();
    
        boolean whereAdded = false;
    
        if (autores != null && !autores.isEmpty()) {
            query.append("JOIN b.listaAutor autor ");
            query.append(whereAdded ? "AND " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("b.editora.id IN (:editoras) ");
            params.put("editoras", editoras);
            whereAdded = true;
        }
        if (generos != null && !generos.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("g.id IN (:generos) ");
            params.put("generos", generos);
        }
    
        return find(query.toString(), params).project(Long.class).list();
    }
    

    public List<Long> findAutoresByFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        StringBuilder query = new StringBuilder("SELECT DISTINCT autor.id FROM Box b JOIN b.listaAutor autor ");
        Map<String, Object> params = new HashMap<>();
    
        boolean whereAdded = false;
    
        if (autores != null && !autores.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("b.editora.id IN (:editoras) ");
            params.put("editoras", editoras);
            whereAdded = true;
        }
        if (generos != null && !generos.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ")
                 .append("EXISTS (SELECT 1 FROM b.listaGeneros genero WHERE genero.id IN (:generos)) ");
            params.put("generos", generos);
        }
    
        return find(query.toString(), params).project(Long.class).list();
    }
}
