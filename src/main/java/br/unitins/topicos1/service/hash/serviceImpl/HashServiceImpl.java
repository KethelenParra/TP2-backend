package br.unitins.topicos1.service.hash.serviceImpl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import br.unitins.topicos1.service.hash.HashService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HashServiceImpl implements HashService {

    // sequencia aleatória a ser adicionada na senha
    private String salt = "#blahxyz17";
    // contagem de iteracoes
    private Integer iterationCount = 405;
    // comprimento do hash em bits
    private Integer keyLength = 512;

    @Override
    public String getHashSenha(String senha) {

        verificarSenhaNaoNulaOuVazia(senha);

        try {
            // Geração do hash
            byte[] result = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512")
                .generateSecret(
                        new PBEKeySpec(senha.toCharArray(), salt.getBytes(), iterationCount, keyLength))
                .getEncoded();
            return Base64.getEncoder().encodeToString(result);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException("Erro ao gerar o hash da senha: " + e.getMessage(), e);
        }
    }

    public void verificarSenhaNaoNulaOuVazia(String senha) {
        if (senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("A senha não pode ser nula ou vazia.");
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException{
        HashService hash = new HashServiceImpl();
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
        System.out.println(hash.getHashSenha("123"));
   }

    @Override
    public boolean verificandoHash(String senha, String hash){
        return getHashSenha(senha).equals(hash);
    }

}