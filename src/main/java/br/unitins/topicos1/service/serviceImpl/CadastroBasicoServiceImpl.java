package br.unitins.topicos1.service.serviceImpl;

import br.unitins.topicos1.dto.CadastroBasicoDTO;
import br.unitins.topicos1.dto.TelefoneDTO;
import br.unitins.topicos1.dto.Response.CadastroBasicoResponseDTO;
import br.unitins.topicos1.model.Enum.Sexo;
import br.unitins.topicos1.model.Pessoa.Cliente;
import br.unitins.topicos1.model.Pessoa.Usuario;
import br.unitins.topicos1.repository.pessoa.ClienteRepository;
import br.unitins.topicos1.repository.pessoa.UsuarioRepository;
import br.unitins.topicos1.service.CadastroBasicoService;
import br.unitins.topicos1.service.hash.HashService;
import br.unitins.topicos1.validation.ValidationException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@ApplicationScoped
public class CadastroBasicoServiceImpl implements CadastroBasicoService {

    @Inject
    ClienteRepository clienteRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    HashService hashService;

    @Override
    @Transactional
    public CadastroBasicoResponseDTO create(@Valid CadastroBasicoDTO dto) {
        Cliente cliente = new Cliente();

        cliente.setCep(dto.cep());
        cliente.setLogradouro(dto.logradouro());
        cliente.setComplemento(dto.complemento());
        cliente.setBairro(dto.bairro());
        cliente.setLocalidade(dto.localidade());
        cliente.setUf(dto.uf());

        Usuario usuario = new Usuario();
        
        validarEmailCliente(dto.email());

        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setUsername(dto.username());
        usuario.setCpf(dto.cpf());
        usuario.setSenha(hashService.getHashSenha(dto.senha()));
        usuario.setTelefone(TelefoneDTO.convertToTelefone(dto.telefone()));
        usuario.setSexo(Sexo.valueOf(dto.idSexo()));


        usuarioRepository.persist(usuario);

        cliente.setUsuario(usuario);

        clienteRepository.persist(cliente);
        return CadastroBasicoResponseDTO.valueOf(cliente);
    }   

    public void validarEmailCliente(String email){
        Usuario cliente = usuarioRepository.findByEmailUsuario(email);
        if (cliente != null) {
            throw new ValidationException("email", "O Email: '" + email + "' já existe. - Executando ClienteServiceImpl_validarEmailCliente");
        }
    }
    
}
