/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
    - Se a média de idade dos alunos é inferior de 25, apresentar a mensagem "Turma Jovem";
    - Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem "Turma Adulta";
    - Se a média de idade dos alunos é acima de 40 anos, apresentar a mensagem "Turma Idosa". 
 */
public class Exercicio5 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a 1ª idade: ");
        int idade1 = sc.nextInt();
        
        System.out.println("Informe a 2ª idade: ");
        int idade2 = sc.nextInt();
        
        System.out.println("Informe a 3ª idade: ");
        int idade3 = sc.nextInt();
        
        int mediaDeIdades = idade1 + idade2 + idade3 / 3;
        
        if (mediaDeIdades < 25) 
            System.out.println("Turma jovem.");
        else if (mediaDeIdades >= 25 && mediaDeIdades <= 40) 
            System.out.println("Turma adulta.");
        else 
            System.out.println("Turma idosa.");
    }
}
