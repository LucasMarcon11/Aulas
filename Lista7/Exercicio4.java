
package Lista7;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java para ler um valor inteiro posivo e verificar se este valor é um número primo.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe o número: ");
        int numero = s.nextInt();
        
        int i = 1, resto = 0;
        while (i <= numero) {
            
            if (numero % i == 0) resto++;
            i++;
        }
        
        if (resto == 2) System.out.println("O número é primo!");
        else System.out.println("Não é primo.");
    }
}
