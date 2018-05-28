
package Lista6;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java para ler 10 números e encontrar o maior e menor entre eles.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int maior = 0, menor = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print("Informe o " +(i + 1)+ " número: ");
            int numero = s.nextInt();
            
            if (i == 0) {
                
                maior = numero;
                menor = numero;
            } else {
                
                if (numero > maior) {
                    
                    maior = numero;
                } else if (numero < menor) {
                    
                    menor = numero;
                }
            }
        }
        
        System.out.println("O maior número digitado é: " +maior);
        System.out.println("O menor número digitado é: " +menor);
    }
}
