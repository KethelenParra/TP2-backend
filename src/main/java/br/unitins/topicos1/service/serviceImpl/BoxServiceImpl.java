package br.unitins.topicos1.service.serviceImpl;

import java.util.List;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.dto.Response.BoxResponseDTO;
import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.model.box.Box;
import br.unitins.topicos1.repository.LivroRepository;
import br.unitins.topicos1.repository.AutorRepository;
import br.unitins.topicos1.repository.BoxRepository;
import br.unitins.topicos1.repository.EditoraRepository;
import br.unitins.topicos1.repository.FornecedorRepository;
import br.unitins.topicos1.repository.GeneroRepository;
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

    @Inject
    public AutorRepository autorRepository;

    @Inject
    public EditoraRepository editoraRepository;

    @Inject
    public GeneroRepository generoRepository;

    @Override
    @Transactional
    public BoxResponseDTO create(@Valid BoxDTO dto) {
        validarNomeBox(dto.nome());
        Box box = new Box();
        box.setNome(dto.nome());
        box.setDescricaoBox(dto.descricaoBox());
        box.setQuantidadeEstoque(dto.quantidadeEstoque());
        box.setFornecedor(fornecedorRepository.findById(dto.fornecedor()));
        box.setEditora(editoraRepository.findById(dto.editora()));
        box.setPreco(dto.preco());
        box.setClassificacao(Classificacao.valueOf(dto.classificacao()));
        box.setListaGeneros(dto.generos().stream().map(g -> generoRepository.findById(g)).toList());
        box.setListaAutor((dto.autores()).stream().map(a -> autorRepository.findById(a)).toList());
                
        boxRepository.persist(box);
        
        return BoxResponseDTO.valueOf(box);
    }

    public void validarNomeBox(String nome) {
        Box box = boxRepository.findByNomeBox(nome);
        if (box != null)
            throw  new ValidationException("nome", "O nome '"+nome+"' já existe.");
    }

    @Override
    @Transactional
    public void update(Long id, BoxDTO dto) {
        Box boxBanco = boxRepository.findById(id);

        if(boxBanco == null)
            throw new ValidationException("id", "Box não encontrada.");
            
        boxBanco.setNome(dto.nome());
        boxBanco.setDescricaoBox(dto.descricaoBox());
        boxBanco.setQuantidadeEstoque(dto.quantidadeEstoque());
        boxBanco.setFornecedor(fornecedorRepository.findById(dto.fornecedor()));
        boxBanco.setEditora(editoraRepository.findById(dto.editora()));
        boxBanco.setPreco(dto.preco());
        boxBanco.setClassificacao(Classificacao.valueOf(dto.classificacao()));
        boxBanco.setListaGeneros(dto.generos().stream().map(g -> generoRepository.findById(g)).toList());    
        boxBanco.setListaAutor((dto.autores()).stream().map(a -> autorRepository.findById(a)).toList());
        
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
        return BoxResponseDTO.valueOf(boxRepository.findById(id));
    }

    @Override
    public List<BoxResponseDTO> findAll() {
        return boxRepository.listAll().stream().map(a -> BoxResponseDTO.valueOf(a)).toList();
    }

    @Override
    public List<BoxResponseDTO> findByNome(String nome) {
        return boxRepository.findByBox(nome).stream()
            .map(a -> BoxResponseDTO.valueOf(a)).toList();
    }

    @Override
    public List<BoxResponseDTO> findByAutor(String autor) {
        return boxRepository.findByAutor(autor).stream().map(e -> BoxResponseDTO.valueOf(e)).toList();
    }
}