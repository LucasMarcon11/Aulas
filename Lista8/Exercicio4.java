
package Lista8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Escreva um algoritmo que leia uma String e mostre na tela a String invertida.
    Exemplo: se o usuário digitar “ALGORITMOS” deve-se mostrar na tela “SOMTIROGLA”
 */
public class Exercicio4 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String palavraInvertida = "";
        
        System.out.print("Digite alguma palavra e pressione ENTER: ");
        String palavra = br.readLine();
        
        for (int i = palavra.length() - 1; i >= 0; i--) 
            palavraInvertida += String.valueOf(palavra.charAt(i));
        
        System.out.println("A palavra invertida é: " +palavraInvertida);
    }
}
