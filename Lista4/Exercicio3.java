
package Lista4;

import java.util.Scanner;

/* Um posto está vendendo combustíveis com a seguinte tabela de descontos:
- Álcool: até 20 litros, desconto de 3% por litro; acima de 20 litros, desconto de 5% por litro;
- Gasolina: até 20 litros, desconto de 4% por litro; acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da
seguinte forma: 1- álcool, 2-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que
o preço do litro da gasolina é R$ 4,50 o preço do litro do álcool é R$ 3,90. */

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double alcool = 3.9;
        double gasolina = 4.5;
        double valorPago;

        System.out.print("Abastecer com: 1 - Álcool || 2 - Gasolina: ");
        int operacao = sc.nextInt();
        
        System.out.println("Informe a quantidade de litros a ser abastecido: ");
        int litros = sc.nextInt();
        
        if (operacao == 1) {
            
            if (litros <= 20) {
                
                valorPago = (alcool -= alcool * 0.03) * litros;
            } else {
                
                valorPago = (alcool -= alcool * 0.05) * litros;
            }
            
            System.out.printf("O valor pago abastecido em álcool é de "
                    , "R$ %.2f", valorPago);
        } else {
            
            if (litros <= 20) {
                
                valorPago = (gasolina -= gasolina * 0.04) * litros;
            } else {
                
                valorPago = (gasolina -= gasolina * 0.06) * litros;
            }
            
System.out.printf("O valor pago abastecido em gasolina é de R$ %.2f", valorPago);
        }
        
    }
}
