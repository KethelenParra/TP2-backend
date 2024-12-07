package br.unitins.topicos1.service.serviceImpl;

import java.util.List;

import org.eclipse.microprofile.jwt.JsonWebToken;

import br.unitins.topicos1.dto.AlterarEmailDTO;
import br.unitins.topicos1.dto.AlterarUsernameDTO;
import br.unitins.topicos1.dto.ClienteDTO;
import br.unitins.topicos1.dto.TelefoneDTO;
import br.unitins.topicos1.dto.Response.AlterarSenhaDTO;
import br.unitins.topicos1.dto.Response.ClienteResponseDTO;
import br.unitins.topicos1.dto.Response.ItemDesejoResponseDTO;
import br.unitins.topicos1.dto.Response.UsuarioResponseDTO;
import br.unitins.topicos1.model.Enum.Sexo;
import br.unitins.topicos1.model.Pessoa.Cliente;
import br.unitins.topicos1.model.Pessoa.ItemDesejo;
import br.unitins.topicos1.model.Pessoa.Usuario;
import br.unitins.topicos1.model.box.Box;
import br.unitins.topicos1.model.livro.Livro;
import br.unitins.topicos1.repository.BoxRepository;
import br.unitins.topicos1.repository.ItemRepository;
import br.unitins.topicos1.repository.LivroRepository;
import br.unitins.topicos1.repository.pessoa.ClienteRepository;
import br.unitins.topicos1.repository.pessoa.UsuarioRepository;
import br.unitins.topicos1.service.ClienteService;
import br.unitins.topicos1.service.hash.HashService;
import br.unitins.topicos1.validation.ValidationException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService {
    
    @Inject
    public ClienteRepository clienteRepository;

    @Inject
    public UsuarioRepository usuarioRepository;

    @Inject
    public ItemRepository itemRepository;

    @Inject
    public LivroRepository livroRepository;

    @Inject
    public BoxRepository boxRepository;

    @Inject
    public HashService hashService;

    @Inject
    private JsonWebToken tokenJwt;

    @Override
    @Transactional
    public ClienteResponseDTO create(@Valid ClienteDTO dto) {
        validarCpfCliente(dto.cpf());
        validarEmailCliente(dto.email());

        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome());
        usuario.setUsername(dto.username());
        usuario.setSenha(hashService.getHashSenha(dto.senha())); 
        usuario.setDataNascimento(dto.dataNascimento());
        usuario.setEmail(dto.email());
        usuario.setCpf(dto.cpf());
        usuario.setSexo(Sexo.valueOf(dto.idSexo()));
        usuario.setTelefone(TelefoneDTO.convertToTelefone(dto.telefone()));

        usuarioRepository.persist(usuario);

        Cliente cliente = new Cliente();
        cliente.setCep(dto.cep());
        cliente.setComplemento(dto.complemento());
        cliente.setBairro(dto.bairro());
        cliente.setLocalidade(dto.localidade());
        cliente.setUf(dto.uf());
        cliente.setUsuario(usuario);

        clienteRepository.persist(cliente);
        return ClienteResponseDTO.valueOf(cliente);
    }

    @Override
    @Transactional
    public void update(Long id, ClienteDTO dto) {
        validarCpfCliente(dto.cpf());
        Cliente clienteBanco = clienteRepository.findById(id);
        
        if (clienteBanco == null) {
            throw new ValidationException("Update cliente","Cliente não encontrado - Executando ClienteServiceImpl_update");
        }
        
        clienteBanco.setCep(dto.cep());
        clienteBanco.setComplemento(dto.complemento());
        clienteBanco.setBairro(dto.bairro());
        clienteBanco.setLocalidade(dto.localidade());
        clienteBanco.setUf(dto.uf());
                
        Usuario usuario = clienteBanco.getUsuario();
        usuario.setNome(dto.nome());
        usuario.setUsername(dto.username());
        usuario.setSenha(hashService.getHashSenha(dto.senha()));
        usuario.setDataNascimento(dto.dataNascimento());
        usuario.setEmail(dto.email());
        usuario.setCpf(dto.cpf());
        usuario.setSexo(Sexo.valueOf(dto.idSexo()));
        usuario.setTelefone(TelefoneDTO.convertToTelefone(dto.telefone()));

        usuarioRepository.persist(usuario);
        clienteRepository.persist(clienteBanco);
    }

    @Override
    @Transactional
    public void delete(Long id) throws IllegalArgumentException, NotFoundException {
        if (id == null) {
            throw new IllegalArgumentException("Id inválido");
        }

        Cliente cliente = clienteRepository.findById(id);

        if (cliente == null) {
            throw new NotFoundException("Cliente não encontrado - Executando ClienteServiceImpl_delete");
        }

        clienteRepository.delete(cliente);
    }

    @Override
    public ClienteResponseDTO findById(Long id) throws NotFoundException {
        Cliente cliente = clienteRepository.findById(id);
        
        if (cliente == null) {
            throw new NotFoundException("Cliente não encontrado - Executando ClienteServiceImpl_findById");
        }
        return ClienteResponseDTO.valueOf(cliente);
    }

    @Override
    public List<ClienteResponseDTO> findAll(int page, int pageSize) {
        List<Cliente> listCliente = clienteRepository
                                            .findAll()
                                            .page(page, pageSize)
                                            .list();

        return listCliente.stream()
            .map(clientes -> ClienteResponseDTO.valueOf(clientes))
            .toList();
    }

    @Override
    public List<ClienteResponseDTO> findByEstado(String estado) {
        return clienteRepository.findByEstado(estado).stream().map(ClienteResponseDTO::valueOf).toList();
    }

    @Override
    public List<UsuarioResponseDTO> findByCpf(String cpf) {
        return usuarioRepository.findByCpf(cpf).stream().map(UsuarioResponseDTO::valueOf).toList();
    }

    @Override
    public long count() {
        return usuarioRepository.count();
    }
    
    @Override
    public UsuarioResponseDTO login(String username, String senha) {
        Cliente cliente = clienteRepository.findByUsernameAndSenha(username, senha);
        if (cliente == null) {
            throw new NullPointerException("cliente não encontrado - Executando ClienteServiceImpl_login");
        }
        return UsuarioResponseDTO.valueOf(cliente.getUsuario());
    }
    
    public void validarCpfCliente(String cpf) {
        Usuario cliente = usuarioRepository.findByCpfUsuario(cpf);
        if (cliente != null) {
            throw new ValidationException("cpf", "O CPF: '" + cpf + "' já existe. - Executando ClienteServiceImpl_validarCpfCliente");
        }
    }

    public void validarEmailCliente(String email){
        Usuario cliente = usuarioRepository.findByEmailUsuario(email);
        if (cliente != null) {
            throw new ValidationException("email", "O Email: '" + email + "' já existe. - Executando ClienteServiceImpl_validarEmailCliente");
        }
    }

    @Override
    @Transactional
    public void alterarSenha(AlterarSenhaDTO dto) {
        Usuario usuario = usuarioRepository.findById(Long.valueOf(tokenJwt.getClaim("id").toString()));

        Cliente cliente = clienteRepository.findByIdUsuario(usuario.getId());

        if(cliente == null || !hashService.verificandoHash(dto.senhaAntiga(), cliente.getUsuario().getSenha())){
            throw new ValidationException("senhaAntiga", "Senha antiga não confere - Executando ClienteServiceImpl_alterarSenha");
        }

        cliente.getUsuario().setSenha(hashService.getHashSenha(dto.novaSenha()));
        usuarioRepository.persist(cliente.getUsuario());
    }

    @Override
    @Transactional
    public void alterarUsername(AlterarUsernameDTO dto) {
        
        Usuario usuario = usuarioRepository.findById(Long.valueOf(tokenJwt.getClaim("id").toString()));

        Cliente cliente = clienteRepository.findByIdUsuario(usuario.getId());

        if (cliente == null || !hashService.verificandoHash(dto.senha(), cliente.getUsuario().getSenha())) {
            throw new ValidationException("senhaAntiga", "Senha incorreta - Executando ClienteServiceImpl_alterarUsername");
        }

        cliente.getUsuario().setUsername(dto.usernameNovo());
        usuarioRepository.persist(cliente.getUsuario());
    }

    @Override
    @Transactional
    public void alterarEmail(AlterarEmailDTO dto) {
        Usuario usuario = usuarioRepository.findById(Long.valueOf(tokenJwt.getClaim("id").toString()));

        Cliente cliente = clienteRepository.findByIdUsuario(usuario.getId());

        if (cliente == null || !hashService.verificandoHash(dto.senha(), cliente.getUsuario().getSenha())) {
            throw new ValidationException("senhaAntiga", "Senha incorreta - Executando ClienteServiceImpl_alterarEmail");
        }

        cliente.getUsuario().setEmail(dto.emailNovo());
        usuarioRepository.persist(cliente.getUsuario());
    }

    @Override
    @Transactional
    public ClienteResponseDTO findMeuPerfil() {
        Usuario usuario = usuarioRepository.findById(Long.valueOf(tokenJwt.getClaim("id").toString()));

        Cliente cliente = clienteRepository.findByIdUsuario(usuario.getId());

        if (cliente == null) {
            throw new ValidationException("Perfil","Cliente não encontrado - Executando ClienteServiceImpl_findMeuPerfil");
        }
        return ClienteResponseDTO.valueOf(cliente);
    }

    
@Override
    @Transactional
    public void adicionarItemDesejo(Long idLivro, Long idBox) {
        Usuario usuario = usuarioRepository.findById(Long.valueOf(tokenJwt.getClaim("id").toString()));
        Cliente cliente = clienteRepository.findByIdUsuario(usuario.getId());

        if (cliente == null) {
            throw new ValidationException("cliente","Cliente não encontrado.");
        }

        ItemDesejo itemDesejo = new ItemDesejo();
        itemDesejo.setCliente(cliente);

        if (idLivro != null) {
            Livro livro = livroRepository.findById(idLivro);
            if (livro == null) {
                throw new NotFoundException("Livro não encontrado.");
            }
            itemDesejo.setLivro(livro);
        } else if (idBox != null) {
            Box box = boxRepository.findById(idBox);
            if (box == null) {
                throw new NotFoundException("Box não encontrado.");
            }
            itemDesejo.setBox(box);
        } else {
            throw new ValidationException("itemDesejo","É necessário fornecer um ID de livro ou box.");
        }

        itemRepository.persist(itemDesejo);
    }

    @Override
    @Transactional
    public void removerItemDesejo(Long idItem) {
        ItemDesejo item = itemRepository.findById(idItem);
        if (item == null) {
            throw new NotFoundException("Item de desejo não encontrado.");
        }
        itemRepository.delete(item);
    }

    @Override
    public List<ItemDesejoResponseDTO> findListaDesejos() {
        Usuario usuario = usuarioRepository.findById(Long.valueOf(tokenJwt.getClaim("id").toString()));
        Cliente cliente = clienteRepository.findByIdUsuario(usuario.getId());

        if (cliente == null) {
            throw new ValidationException("cliente","Cliente não encontrado.");
        }

        return cliente.getListaDesejo()
                .stream()
                .map(ItemDesejoResponseDTO::valueOf)
                .toList();
    }

}
