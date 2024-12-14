package br.unitins.topicos1.dto.Response;

import br.unitins.topicos1.model.Enum.Sexo;
import br.unitins.topicos1.model.Pessoa.Cliente;

public record CadastroBasicoResponseDTO(
        Long id,
        String nome,
        String email,
        String username,
        String cpf,
        Sexo sexo,
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf
) {

    public static CadastroBasicoResponseDTO valueOf(Cliente cliente) {
        return new CadastroBasicoResponseDTO(
            cliente.getId(), 
            cliente.getUsuario().getNome(),
            cliente.getUsuario().getEmail(),
            cliente.getUsuario().getUsername(),
            cliente.getUsuario().getCpf(),
            cliente.getUsuario().getSexo(),
            cliente.getCep(),
            cliente.getLogradouro(),
            cliente.getComplemento(),
            cliente.getBairro(),
            cliente.getLocalidade(),
            cliente.getUf()           
        );
    }
}
