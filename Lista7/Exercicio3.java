
package Lista7;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java que leia dois números (base, expoente) e calcule o resultado de
    base^expoente. O valor da base deve ser maior ou igual a 2 e o valor do expoente deve ser maior que 1.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe o valor da base: ");
        int base = s.nextInt();
        
        if (base < 2) System.out.println("O valor da base deve ser maior do que 2!");
        else {
            
            System.out.print("Informe o valor do expoente: ");
            int expoente = s.nextInt();
            
            int i = 1, resultado = base;
            while (i < expoente) {
                
                resultado *= base;
                i++;
            }
            
            System.out.println("Resultado: " +resultado);
        }
    }
}
