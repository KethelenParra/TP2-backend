package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.BoxDTO;
import br.unitins.topicos1.dto.Response.BoxResponseDTO;
import jakarta.validation.Valid;

public interface BoxService {
    public BoxResponseDTO create(@Valid BoxDTO dto);
    public void update(Long id, BoxDTO dto);
    public void delete(Long id);
    public BoxResponseDTO findById(Long id);
    public List<BoxResponseDTO> findAll();
    public List<BoxResponseDTO> findByNome(String nome);
   // public List<BoxResponseDTO> findByAutor(String autor);
}
