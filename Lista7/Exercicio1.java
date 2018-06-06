
package Lista7;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java para ler dois valores inteiros, posivos e diferentes. A classe deve verificar quais valores dentro deste intervalo, quando divididos por 11, dão resto 5.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;

        while (numero1 <= 0 || numero2 <= 0 || numero1 == numero2) {
            
            System.out.print("Informe o primeiro número: ");
            numero1 = s.nextInt();

            System.out.print("Informe o segundo número: ");
            numero2 = s.nextInt();
        }
        
        System.out.println("");
        
        while (numero1 <= numero2) {
         
            if ((numero1 % 11) == 5) 
                System.out.println(numero1);
            
            numero1++;
        }
    }
}
