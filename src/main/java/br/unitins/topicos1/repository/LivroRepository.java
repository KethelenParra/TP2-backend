package br.unitins.topicos1.repository;

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
        return find("SELECT livro FROM Livro livro JOIN livro.listaAutor autor WHERE UPPER(autor.nome) LIKE ?1", autor.toUpperCase() + "%");
    }

    public Livro findByTituloLivro(String titulo) {
        return find("UPPER(titulo) LIKE ?1",  titulo.toUpperCase()).firstResult();
    }



}
