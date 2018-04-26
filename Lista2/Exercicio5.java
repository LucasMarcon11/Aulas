
package Lista2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Embora a lei não possa obrigar o cliente a pagar a gorjeta, normalmente os 
restaurantes cobram gorjeta para o garçom, a qual equivale a 10% do valor 
gasto pelo cliente. Escreva uma classe em Javaque leia o valor gasto pelo 
cliente e pergunte se o mesmo gostaria de pagar gorjeta. Caso o cliente
responda que sim, o algoritmo deve realizar o cálculo da gorjeta informando o 
valor total gasto pelo cliente e o valor da gorjeta ofertada ao garçom.*/

public class Exercicio5 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Informar o total gasto: ");
        double total = sc.nextInt();
        
        System.out.println("Quer pagar a gorjeta? (sim || nao)");
        String operacao = br.readLine();
        
        if (operacao.equals("sim")) {
            
            double gorjeta = total / 10;
            total += gorjeta;
            
            System.out.println("O total pago pelo cliente é de R$ "
                    +total+ " e a gorjeta é de R$ " +gorjeta);
        } else {
            
            System.out.println("O valor total pago pelo cliente é de R$: " +total);
        }
    }
}
