package br.unitins.topicos1.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.unitins.topicos1.dto.EnderecoDTO;
import br.unitins.topicos1.dto.Response.EnderecoResponseDTO;
import br.unitins.topicos1.model.Pessoa.Endereco;
import br.unitins.topicos1.repository.pessoa.EnderecoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ApiCepService {

    @Inject
    EnderecoRepository enderecoRepository;

    @Transactional
    public EnderecoResponseDTO getEndereco(String cep) throws IOException, InterruptedException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            EnderecoDTO enderecoDTO = mapper.readValue(response.body(), EnderecoDTO.class);

            // Converter EnderecoDTO para Entidade Endereco
            Endereco endereco = new Endereco();
            endereco.setCep(enderecoDTO.cep());
            endereco.setLogradouro(enderecoDTO.logradouro());
            endereco.setComplemento(enderecoDTO.complemento());
            endereco.setBairro(enderecoDTO.bairro());
            endereco.setLocalidade(enderecoDTO.localidade());
            endereco.setUf(enderecoDTO.uf());

            // Salvar o endereço no banco de dados
            enderecoRepository.persist(endereco);

            // Converter Endereco para EnderecoResponseDTO
            return new EnderecoResponseDTO(
                endereco.getCep(),
                endereco.getLogradouro(),
                endereco.getComplemento(),
                endereco.getBairro(),
                endereco.getLocalidade(),
                endereco.getUf()
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar o endereço: " + e.getMessage());
        }
    }
}
