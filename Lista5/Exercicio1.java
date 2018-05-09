
package Lista5;

import java.util.Scanner;

/**
 *
 * Construir um programa para identificar quantos dias há em um mês, sabendo o mês e o ano.
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o ano atual: ");
        int ano = sc.nextInt();
        
        System.out.print("Informe o mês atual: ");
        int mes = sc.nextInt();
        
        switch (mes) {
            
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("O mês tem 31 dias!");
                break;
            case 2:
                if (ano % 4 == 0) {
                    
                    System.out.println("O mês tem 29 dias!");
                } else {
                    
                    System.out.println("O mês tem 28 dias!");
                }
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("O mês tem 30 dias!");
                break;
            default: 
                System.out.println("Mês informado erroneamente!");
                break;
        }
    }
}
