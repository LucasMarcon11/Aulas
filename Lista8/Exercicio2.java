
package Lista8;

import java.util.Scanner;

/**
 *
 * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da
    seguinte forma: A- álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que
    o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        final double gasolina = 2.5;
        final double alcool = 1.9;
        
        String combustivel = "";
        
        int litros = 0;
        double valorPago = 0;
        
        while (!combustivel.equals("A") && !combustivel.equals("G")) {
            
            System.out.print("Informe com que combustível deseja abastecer (A - Álcool || G - Gasolina): ");
            combustivel = s.next().toUpperCase();
        }
        
        while (litros <= 0) {
            
            System.out.print("Informe a quantidade de litros que deseja abastecer: ");
            litros = s.nextInt();
        }
        
        switch (combustivel) {
            
            case "A": 
                valorPago = litros * alcool;
                break;
                
            case "G":
                valorPago = litros * gasolina;
                break;
        }
        
        System.out.printf("O valor pago pelo cliente é dê: %.2f", valorPago);
        System.out.println("");
    }
}
