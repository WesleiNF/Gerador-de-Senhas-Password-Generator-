import java.security.SecureRandom;
import java.util.HashSet;
import Java.util.Set;

public class GeradorSenha {
    // Define  os caracteres que podem ser usados na senha
    private static final String CARACTERES_PERMITIDOS = 
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÎÔÛÀÈÌÒÙÃÕÇÑÜÿßæø¿¡ÆßŒʣʪʦЉЊЫѬ0123456789!?ค๒ς๔єŦﻮђเןкɭ๓ภקợгรՇยשאչ˜@#$%^&*()_=|+{}[]/<>,.-";

    // Método para gerar senha aleatória
    public static String gerarSenha(int comprimento) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);  
        
        Set<Character> caracteresUsados = new HashSet<>();

        while (senha.length() < comprimento) {
            int index = random.nextInt(CARACTERES_PERMITIDOS.length());
            char caractere = CARACTERES_PERMITIDOS.charAt(index);
            //senha.append(caractere);
            
            // Verifica se o caractere já foi usado
            if (caracteresUsados.add(caractere)) {
                senha.append(caractere);
            }
        }

        return senha.toString();
    }
    
    public static void main(String[] args) {
        // Defina o comprimento desejado da senha
        int comprimentoSenha = 80;

        // Gere e imprime a senha aleatória
        String senhaGerada = gerarSenha(comprimentoSenha);
        System.out.println();
        System.out.println("Password Key: " + senhaGerada);
        System.out.println();
    }
}




