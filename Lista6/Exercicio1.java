
package Lista6;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java para ler um número inteiro n. Escrever a soma de todos os números de 1 até n.
 */
public class Exercicio1 {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        int resultado = 0;
        
        System.out.print("Informe um número: ");
        int numero = s.nextInt();
        
        for (int i = 1; i <= numero; i++) 
            resultado += i; 
        
        System.out.println("Soma: " +resultado); 
    }
}
