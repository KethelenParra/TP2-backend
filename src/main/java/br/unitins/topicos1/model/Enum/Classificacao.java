package br.unitins.topicos1.model.Enum;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat( shape = JsonFormat.Shape.OBJECT)
public enum Classificacao {
    
    LIVRE(1, "Livre"),
    DEZANOS(2,"10 Anos"),
    DOZEANOS(3, "12 Anos"),
    QUATORZEANOS(4, "14 Anos"),
    DEZESSEISANOS(5, "16 Anos"),
    DEZOITOANOS(6, "18 Anos");
    
    private int id;
    private String descricao;

    Classificacao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
   
    public String getDescricao() {
        return descricao;
    }

    public static Classificacao valueOf(Integer id) throws IllegalArgumentException {
        if (id == null)
            return null;

        for(Classificacao classificacao : Classificacao.values()) {
            if (id.equals(classificacao.getId()))
                return classificacao;
        } 
        throw new IllegalArgumentException("Id inválido:" + id);
    }
}
