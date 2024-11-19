package br.unitins.topicos1.service;

import java.util.List;
import java.util.Map;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.dto.Response.BoxResponseDTO;
import jakarta.validation.Valid;

public interface BoxService {
    public BoxResponseDTO create(@Valid BoxDTO dto);
    public void update(Long id, BoxDTO dto);
    public void delete(Long id);
    public BoxResponseDTO findById(Long id);
    public List<BoxResponseDTO> findByNome(String nome);
    public List<BoxResponseDTO> findByDescricao(String descricao);
    public List<BoxResponseDTO> findByAutor(String autor);
    
    public List<BoxResponseDTO> findAll(int page, int pageSize);
    public List<BoxResponseDTO> findByNome(int page, int pageSize, String nome);
    public List<BoxResponseDTO> findByDescricao(int page, int pageSize, String descricao);
    public List<BoxResponseDTO> findByAutor(int page, int pageSize, String autor);
    public long count();
    public long countByNome(String nome);
    public long countByAutor(String autor);
    public List<BoxResponseDTO> findWithFilters(List<Long> autores, List<Long> editoras, List<Long> generos);
    public Map<String, Object> findWithFiltersAndRelated(List<Long> autores, List<Long> editoras, List<Long> generos);
}
