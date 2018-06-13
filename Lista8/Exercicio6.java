
package Lista8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * Escreva um algoritmo que leia duas String chamadas “texto1” e “texto2”, bem como um inteiro
    chamado “posicao". O algoritmo deve inserir a String “texto2” na String “texto1”, na posição
    “posicao”.
 */
public class Exercicio6 {

    public static void main(String[] args) throws IOException {
        
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Digite algo: ");
        String texto1 = br.readLine().toUpperCase();
        
        System.out.print("Digite algo: ");
        String texto2 = br.readLine().toLowerCase();
        
        System.out.print("Informe uma posição: ");
        int posicao = s.nextInt();
        
        if (posicao <= texto1.length()) {
            
            String novaString = texto1.substring(0, posicao);
            novaString += texto2 += texto1.substring(posicao);
            System.out.println("O valor da nova string é: " +novaString);
        } else {
            
            System.out.println("Posição inválida para cortar a String!");
        }
    }
}
