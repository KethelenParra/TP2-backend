package br.unitins.topicos1.repository;

import br.unitins.topicos1.model.fornecedor.Fornecedor;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FornecedorRepository implements PanacheRepository<Fornecedor>{
        
    public PanacheQuery<Fornecedor> findByNome(String nome){
        return find("UPPER(nome) LIKE ?1", "%" + nome.toUpperCase() + "%");
    }

    public PanacheQuery<Fornecedor> findByCnpj(String cnpj){
        return find("cnpj LIKE ?1", "%" + cnpj + "%");
    }

    public Fornecedor findByNomeFornecedor(String nome) {
        return find("UPPER(nome) = ?1",  nome.toUpperCase() ).firstResult();
    }

    public Fornecedor findByCnpjFornecedor(String cnpj){
        return find("cnpj LIKE ?1", "%" + cnpj + "%").firstResult();
    }
}
