
package Lista6;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java para ler um número inteiro n. Escrever a soma de todos os números pares de 1 até n.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int resultado = 0;
        
        System.out.print("Informe um número: ");
        int numero = s.nextInt();
        
        for (int i = 1; i <= numero; i++) 
            if ((i % 2) == 0)
                resultado += i; 
        
        System.out.println("Soma: " +resultado); 
    }
}
