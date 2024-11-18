package br.unitins.topicos1.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.unitins.topicos1.model.livro.Livro;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LivroRepository implements PanacheRepository<Livro>{
    
    public PanacheQuery<Livro> findByTitulo(String titulo){
        return find("UPPER(titulo) LIKE ?1", "%" + titulo.toUpperCase() + "%");
    }

    public PanacheQuery<Livro> findByIsbn(String isbn){
        return find("isbn LIKE ?1", "%" + isbn + "%");
    }

    public PanacheQuery<Livro> findByDescricao(String descricao){
        return find("UPPER(descricao) LIKE ?1", "%" + descricao.toUpperCase() + "%");
    }

    public PanacheQuery<Livro> findByAutor(String autor){
        return find("SELECT livro FROM Livro livro JOIN livro.listaAutor autor WHERE UPPER(autor.nome) LIKE ?1", "%" + autor.toUpperCase() + "%");
    }

    public Livro findByTituloLivro(String titulo) {
        return find("UPPER(titulo) LIKE ?1",  titulo.toUpperCase()).firstResult();
    }

    public PanacheQuery<Livro> findWithFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        StringBuilder query = new StringBuilder("SELECT DISTINCT l FROM Livro l ");
        Map<String, Object> params = new HashMap<>();
    
        boolean whereAdded = false;
    
        if (autores != null && !autores.isEmpty()) {
            query.append("JOIN l.listaAutor autor ");
            query.append(whereAdded ? "AND " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
    
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("l.editora.id IN (:editoras) ");
            params.put("editoras", editoras);
            whereAdded = true;
        }
    
        if (generos != null && !generos.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ")
                 .append("EXISTS (SELECT 1 FROM l.listaGenero genero WHERE genero.id IN (:generos)) ");
            params.put("generos", generos);
        }
    
        return find(query.toString(), params);
    }
   
    public List<Long> findEditorasByFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        StringBuilder query = new StringBuilder("SELECT DISTINCT l.editora.id FROM Livro l ");
        Map<String, Object> params = new HashMap<>();

        boolean whereAdded = false;

        if (autores != null && !autores.isEmpty()) {
            query.append("JOIN l.listaAutor autor ");
            query.append(whereAdded ? "OR " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "OR " : "WHERE ").append("l.editora.id IN (:editoras) ");
            params.put("editoras", editoras);
            whereAdded = true;
        }
        if (generos != null && !generos.isEmpty()) {
            query.append(whereAdded ? "OR " : "WHERE ")
                 .append("EXISTS (SELECT 1 FROM l.listaGenero genero WHERE genero.id IN (:generos)) ");
            params.put("generos", generos);
        }

        return find(query.toString(), params).project(Long.class).list();
    }

    public List<Long> findGenerosByFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        StringBuilder query = new StringBuilder("SELECT DISTINCT g.id FROM Livro l JOIN l.listaGenero g ");
        Map<String, Object> params = new HashMap<>();

        boolean whereAdded = false;

        if (autores != null && !autores.isEmpty()) {
            query.append("JOIN l.listaAutor autor ");
            query.append(whereAdded ? "AND " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("l.editora.id IN (:editoras) ");
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
        StringBuilder query = new StringBuilder("SELECT DISTINCT autor.id FROM Livro l JOIN l.listaAutor autor ");
        Map<String, Object> params = new HashMap<>();
    
        boolean whereAdded = false;
    
        if (autores != null && !autores.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("autor.id IN (:autores) ");
            params.put("autores", autores);
            whereAdded = true;
        }
        if (editoras != null && !editoras.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ").append("l.editora.id IN (:editoras) ");
            params.put("editoras", editoras);
            whereAdded = true;
        }
        if (generos != null && !generos.isEmpty()) {
            query.append(whereAdded ? "AND " : "WHERE ")
                 .append("EXISTS (SELECT 1 FROM l.listaGenero genero WHERE genero.id IN (:generos)) ");
            params.put("generos", generos);
        }
    
        return find(query.toString(), params).project(Long.class).list();
    }
                    
}