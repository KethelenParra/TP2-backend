package br.unitins.topicos1.service.serviceImpl;

import java.util.List;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.dto.Response.BoxResponseDTO;
import br.unitins.topicos1.model.box.Box;
import br.unitins.topicos1.repository.LivroRepository;
import br.unitins.topicos1.repository.BoxRepository;
import br.unitins.topicos1.repository.FornecedorRepository;
import br.unitins.topicos1.service.BoxService;
import br.unitins.topicos1.validation.ValidationException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@ApplicationScoped
public class BoxServiceImpl implements BoxService {

    @Inject
    public LivroRepository livroRepository;

    @Inject
    public BoxRepository boxRepository;

    @Inject
    public FornecedorRepository fornecedorRepository;

    @Override
    @Transactional
    public BoxResponseDTO create(@Valid BoxDTO dto) {
        Box box = new Box();
        box.setNome(dto.nome());
        box.setDescricaoBox(dto.descricao());
        box.setFornecedor(fornecedorRepository.findById(dto.fornecedor()));
        box.setQuantidadeEstoque(dto.estoque());
        
        boxRepository.persist(box);
        
        return BoxResponseDTO.valueof(box);
    }

    @Override
    @Transactional
    public void update(Long id, BoxDTO dto) {
        Box boxBanco = boxRepository.findById(id);

        if(boxBanco == null)
            throw new ValidationException("id", "Box não encontrada.");
            
        boxBanco.setNome(dto.nome());
        boxBanco.setDescricaoBox(dto.descricao());
        boxBanco.setFornecedor(fornecedorRepository.findById(dto.fornecedor()));
        boxBanco.setQuantidadeEstoque(dto.estoque());
        
        boxRepository.persist(boxBanco);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (id == null)
           throw new ValidationException("id", "Id não pode ser nulo.");
        boxRepository.deleteById(id);
    }

    @Override
    public BoxResponseDTO findById(Long id) {
        return BoxResponseDTO.valueof(boxRepository.findById(id));
    }

    @Override
    public List<BoxResponseDTO> findAll() {
        return boxRepository.listAll().stream().map(a -> BoxResponseDTO.valueof(a)).toList();
    }

    @Override
    public List<BoxResponseDTO> findByNome(String nome) {
        return boxRepository.findByBox(nome).stream()
            .map(a -> BoxResponseDTO.valueof(a)).toList();
    }
}
