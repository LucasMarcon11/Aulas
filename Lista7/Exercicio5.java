
package Lista7;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java para ler um valor inteiro positivo “n” e mostrar o resultado do cálculo a seguir: Soma = 1 + 1/2 + 1/3 + ... + 1/n
 */
public class Exercicio5 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe o número: ");
        double numero = s.nextDouble();
        
        double soma = 0, i = 1;
        while (i <= numero) {
            
            soma += 1 / i;
            i++;
        }
        
        System.out.println("Soma: " +soma);
    }
}
