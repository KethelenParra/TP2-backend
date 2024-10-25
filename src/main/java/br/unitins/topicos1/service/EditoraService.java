package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.EditoraDTO;
import br.unitins.topicos1.dto.Response.EditoraResponseDTO;
import jakarta.validation.Valid;

public interface EditoraService {
    
   public EditoraResponseDTO create(@Valid EditoraDTO dto);
   public void update(Long id, EditoraDTO dto);
   public void delete(Long id);
   public EditoraResponseDTO findById(Long id);
   public List<EditoraResponseDTO> findByNome(String nome);
   
   public List<EditoraResponseDTO> findAll(int page, int pageSize);
   public List<EditoraResponseDTO> findByNome(int page, int pageSize, String nome);
   public long count();
   public long countByNome(String nome);
}
