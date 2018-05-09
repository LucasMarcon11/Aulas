
package Lista5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Criar um programa para identificar se um mês digitado pelo usuário é de alta ou baixa temporada (considerar os 
 * seguintes meses como alta temporada: dezembro a fevereiro, junho e julho)
 */
public class Exercicio2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Informe o mês: ");
        String mes = br.readLine().toLowerCase();
        
        switch (mes) {
            
            case "fevereiro": case "junho": case "julho": case "dezembro":
                System.out.println("Alta temporada!");
                break;
            case "janeiro": case "março": case "abril": case "maio": case "agosto": case "setembro": case "novembro":
                System.out.println("Baixa temporada!");
                break;
            default:
                System.out.println("Mês informado erroneamente!");
                break;
        }
    }
}
