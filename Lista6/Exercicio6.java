
package Lista6;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java que receba um número, calcule e mostre a tabuada desse número.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe um número para calcular sua tabuada: ");
        int numero = s.nextInt();
        
        System.out.println("");
        
        for (int i = 1; i <= 10; i++) 
            System.out.println(numero+ " x " +i+ " = " +(numero * i));
    }
}
