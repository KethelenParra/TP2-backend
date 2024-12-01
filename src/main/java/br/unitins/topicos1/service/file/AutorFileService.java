package br.unitins.topicos1.service.file;

import java.io.File;

public interface AutorFileService {

    void salvar(Long id, String nomeImagem, byte[] imagem);
    File download(String nomeImagem);
    
}
