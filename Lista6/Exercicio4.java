
package Lista6;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java para ler 4 números e calcular a média desses números.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int soma = 0;
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("Informe o " +(i + 1)+ "º número: ");
            soma += s.nextInt();
        }

        System.out.println("Média: " +(soma / 4));
    }
}
