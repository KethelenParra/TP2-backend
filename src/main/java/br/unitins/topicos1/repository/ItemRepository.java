package br.unitins.topicos1.repository;

import br.unitins.topicos1.model.Pessoa.ItemDesejo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemRepository implements PanacheRepository<ItemDesejo> {
}
