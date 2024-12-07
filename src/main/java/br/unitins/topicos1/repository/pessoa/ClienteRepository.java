package br.unitins.topicos1.repository.pessoa;

import java.util.List;

import br.unitins.topicos1.model.Pessoa.Cliente;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente>{
    public PanacheQuery<Cliente> findByEstado(String estado){
        return find("UPPER(estado) LIKE ?1", "%" + estado.toUpperCase() + "%");
    }

    public List<Cliente> findByNome(String nome){

        if(nome == null){
            return null;
        }
        return find("UPPER(usuario.nome) LIKE ?1", "%" + nome.toUpperCase() + "%").list();
    }

    public Cliente findByUsernameAndSenha(String username, String senha) {
        if(username == null || senha == null){
            return null;
        }

        return find("usuario.username = ?1 AND usuario.senha = ?2", username, senha).firstResult();
    }

    public Cliente findByUsername(String username) {

        if (username == null){
            return null;
        }
        return find("usuario.username", username).firstResult();
    }

    public Cliente findByIdUsuario(Long idUsuario){
        return find("usuario.id", idUsuario).firstResult();
    }

}
