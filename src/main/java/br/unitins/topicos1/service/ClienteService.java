package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.AlterarEmailDTO;
import br.unitins.topicos1.dto.AlterarUsernameDTO;
import br.unitins.topicos1.dto.ClienteDTO;
import br.unitins.topicos1.dto.Response.AlterarSenhaDTO;
import br.unitins.topicos1.dto.Response.ClienteResponseDTO;
import br.unitins.topicos1.dto.Response.LivroResponseDTO;
import br.unitins.topicos1.dto.Response.UsuarioResponseDTO;
import jakarta.validation.Valid;

public interface ClienteService {
    public ClienteResponseDTO create(@Valid ClienteDTO dto);
    public void update(Long id, ClienteDTO dto);
    public void delete(Long id);
    public ClienteResponseDTO findById(Long id);
    public List<ClienteResponseDTO> findAll(int page, int pageSize);
    public List<ClienteResponseDTO> findByEstado(String estado);
    public List<UsuarioResponseDTO> findByCpf(String cpf);
    public UsuarioResponseDTO login(String username, String senha);

    public void alterarSenha(AlterarSenhaDTO dto);
    public void alterarUsername(AlterarUsernameDTO dto);
    public void alterarEmail(AlterarEmailDTO dto);

    public long count();

    public ClienteResponseDTO findMeuPerfil();
    public void adicionarLivroDesejo(Long idLivro);
    public void removerLivroDesejo(Long idLivro);

    public List<LivroResponseDTO> findLivrosDesejados();

}
