
package Lista4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * Faça um algoritmo para ler o nome, as três notas e o número de faltas de um aluno e escrever qual a
*  sua situação final: Aprovado, Reprovado por Falta ou Reprovado por Média. A média para aprovação é
*  7,0 e o limite de faltas é 25% do total de aulas. O número de aulas ministradas no semestre foi de 80.
*  A reprovação por falta sobrepõe a reprovação por Média. 
 */
public class Exercicio1 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Informações do aluno 1
        System.out.print("Nome do aluno: ");
        String nome = br.readLine();
        
        System.out.print("Informe a 1ª nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Informe a 2ª nota: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Informe a 3ª nota: ");
        double nota3 = sc.nextDouble();
        
        System.out.print("Informe a quantidade de faltas do aluno: ");
        int faltas = sc.nextInt();
        
        // Processamento
        int mediaDeAprovacao = 7;
        int totalDeAulasMinistradas = 80;
        double limiteDeFaltas = totalDeAulasMinistradas * 0.25;
        
        double mediaAluno = (nota1 + nota2 + nota3) / 3;
        
        if (faltas > limiteDeFaltas) {
            
            System.out.println("Aluno reprovado por frequência!");
        } else {
            
            if (mediaAluno >= mediaDeAprovacao) {
                
                System.out.println("O aluno " +nome+ " foi aprovado por média, com média dê: " +mediaAluno);
            } else {
                
                System.out.println("O aluno " +nome+ " foi reprovado por média, com média dê: " +mediaAluno);
            }
        }
    }
}
