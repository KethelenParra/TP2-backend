package br.unitins.topicos1.service.serviceImpl;

import java.util.List;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.dto.Response.BoxResponseDTO;
import br.unitins.topicos1.model.Enum.Classificacao;
import br.unitins.topicos1.model.autor.Autor;
import br.unitins.topicos1.model.box.Box;
import br.unitins.topicos1.model.editora.Editora;
import br.unitins.topicos1.model.fornecedor.Fornecedor;
import br.unitins.topicos1.model.genero.Genero;
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

    private int classificacaoId;

    @Override
    @Transactional
    public BoxResponseDTO create(@Valid BoxDTO dto) {
        
        Classificacao classificacaoEnum = Classificacao.getById(dto.classificacao());

        Box box = new Box();
        box.setNome(dto.nome());
        box.setDescricaoBox(dto.descricaoBox());
        box.setQuantidadeEstoque(dto.quantidadeEstoque());
        box.setPreco(dto.preco());

        Fornecedor fornecedor = fornecedorRepository.findById(dto.fornecedor().getId());
        if (fornecedor == null) {
            throw new ValidationException("fornecedor", "Fornecedor não encontrado.");
        }
        box.setFornecedor(fornecedor);
        
        Editora editora = editoraRepository.findById(dto.editora().getId());
        if (editora == null) {
            throw new ValidationException("editora", "Editora não encontrada.");
        }
        box.setEditora(editora);

        List<Autor> autores = dto.autores().stream()
            .map(autorRepository::findById)
            .toList();
        box.setListaAutor(autores);

        List<Genero> generos = dto.generos().stream()
            .map(generoRepository::findById)
            .toList();
        box.setListaGenero(generos);

        box.setClassificacao(classificacaoEnum);

        boxRepository.persist(box);
        
        return BoxResponseDTO.valueOf(box);
    }

    public String getClassificacaoDescricao() {
        return Classificacao.getById(classificacaoId).name();  // Retorna a descrição baseada no ID
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
        boxBanco.setPreco(dto.preco());

        Fornecedor fornecedor = fornecedorRepository.findById(dto.fornecedor().getId());
        if(fornecedor == null){
            throw new ValidationException("fornecedor", "Fornecedor não encontrado");
        }

        Editora editora = editoraRepository.findById(dto.editora().getId());
        if (editora == null) {
            throw new ValidationException("editora", "Editora não encontrada");
        }

        List<Genero> generos = dto.generos().stream()
            .map(generoRepository::findById)
            .toList();
        boxBanco.setListaGenero(generos);

        List<Autor> autores = dto.autores().stream()
            .map(autorRepository::findById)
            .toList();
        boxBanco.setListaAutor(autores);

        Classificacao classificacao = Classificacao.getById(dto.classificacao());
        boxBanco.setClassificacao(classificacao);

        boxRepository.persist(boxBanco);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (id == null)
           throw new ValidationException(   "id", "Id não pode ser nulo.");
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
