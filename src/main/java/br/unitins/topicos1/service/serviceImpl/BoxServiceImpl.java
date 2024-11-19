package br.unitins.topicos1.service.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.dto.Response.BoxResponseDTO;
import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.model.box.Box;
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
    public List<BoxResponseDTO> findAll(int page, int pageSize) {

        List<Box> listBox = boxRepository
                            .findAll()
                            .page(page, pageSize)
                            .list();

        return listBox.stream()
                .map(a -> BoxResponseDTO.valueOf(a))
                .toList();
    }

    @Override
    public List<BoxResponseDTO> findByNome(String nome) {

        List<Box> listBox = boxRepository
                            .findByBox(nome)
                            .list();

        return listBox.stream()
            .map(a -> BoxResponseDTO.valueOf(a))
            .toList();
    }
    @Override
    public List<BoxResponseDTO> findByNome(int page, int pageSize, String nome) {

        List<Box> listBox = boxRepository
                            .findByBox(nome)
                            .page(page, pageSize)
                            .list();

        return listBox.stream()
            .map(a -> BoxResponseDTO.valueOf(a))
            .toList();
    }

    @Override
    public List<BoxResponseDTO> findByAutor(String autor) {

        List<Box> listBox = boxRepository 
                            .findByAutor(autor)
                            .list();

        return listBox.stream()
                        .map(e -> BoxResponseDTO.valueOf(e))
                        .toList();
    }
    
    @Override
    public List<BoxResponseDTO> findByAutor(int page, int pageSize, String autor) {

        List<Box> listBox = boxRepository 
                            .findByAutor(autor)
                            .page(page, pageSize)
                            .list();

        return listBox.stream()
                        .map(e -> BoxResponseDTO.valueOf(e))
                        .toList();
    }

    @Override
    public long count() {
        return boxRepository.count();
    }

    @Override
    public List<BoxResponseDTO> findByDescricao(String descricao) {

        List<Box> listBox = boxRepository
                            .findByBox(descricao)
                            .list();

        return listBox.stream()
            .map(a -> BoxResponseDTO.valueOf(a))
            .toList();
    }

    @Override
    public List<BoxResponseDTO> findByDescricao(int page, int pageSize, String descricao) {
        List<Box> listBox = boxRepository
        .findByBox(descricao)
        .page(page, pageSize)
        .list();

        return listBox.stream()
        .map(a -> BoxResponseDTO.valueOf(a))
        .toList();
    }

    @Override
    public long countByNome(String nome) {
        return boxRepository.findByBox(nome).count();
    }

    @Override
    public long countByAutor(String autor) {
        return boxRepository.findByAutor(autor).count();
    }

    @Override
    public List<BoxResponseDTO> findWithFilters(List<Long> autores, List<Long> editoras, List<Long> generos) {
        List<Box> box = boxRepository.findWithFilters(autores, editoras, generos).list();

        if (box.isEmpty()) {
            throw new ValidationException("filters","Sem livros encontrados com os filtros aplicados."+autores + editoras + generos);
        }

        return box.stream()
                .map(BoxResponseDTO::valueOf)
                .toList();
    }

    @Override
    public Map<String, Object> findWithFiltersAndRelated(List<Long> autores, List<Long> editoras, List<Long> generos) {
        if (autores == null) autores = List.of();
        if (editoras == null) editoras = List.of();
        if (generos == null) generos = List.of();
        
        List<BoxResponseDTO> box = findWithFilters(autores, editoras, generos);
        List<Long> relatedEditoras = boxRepository.findEditorasByFilters(autores, editoras, generos);
        List<Long> relatedGeneros = boxRepository.findGenerosByFilters(autores, editoras, generos);
        List<Long> relatedAutores = boxRepository.findAutoresByFilters(autores, editoras, generos);
    
        Map<String, Object> response = new HashMap<>();
        response.put("boxes", box);
        response.put("editoras", relatedEditoras);
        response.put("generos", relatedGeneros);
        response.put("autores", relatedAutores);
    
        return response;
    }
}