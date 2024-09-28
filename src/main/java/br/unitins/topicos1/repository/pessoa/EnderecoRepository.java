package br.unitins.topicos1.repository.pessoa;

import br.unitins.topicos1.model.Pessoa.Endereco;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EnderecoRepository implements PanacheRepository<Endereco> {

}

