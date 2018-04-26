
package Lista5;

import java.util.Scanner;

/* Criar um programa para identificar se um dia da semana (numerados de 1 a 7) 
é dia de semana, fim de semana ou um dia inválido */

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o dia que quer saber (numerados de 1 a 7): ");
        int dia = sc.nextInt();
        
        switch (dia) {
            
            case 1: case 2: case 3: case 4: case 5: 
                System.out.println("Dia da útil!");
                break;
            case 6: case 7:
                System.out.println("Fim de semana!");
                break;
            default: 
                System.out.println("Dia inválido.");
                break;
        }
    }
}
