package br.unitins.topicos1.service.file;

import java.io.File;
import java.io.IOException;

public interface EditoraFileService {

    void salvar(Long id, String nomeImagem, byte[] imagem) throws IOException;
    File download(String nomeArquivo);
    
}
