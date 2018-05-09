
package Lista4;

import java.util.Scanner;

/**
 *
 * Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for
*  menor que R$ 200,00; caso contrário, o lucro será de 30%. Elabore um algoritmo que leia o valor do
*  produto e imprima o valor de venda para o produto. 
 */
public class Exercicio2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double valorDeVenda;
        
        System.out.print("Valor do produto comprado: ");
        double valor = sc.nextDouble();
        
        if (valor < 200) {
            
            valorDeVenda = valor + (valor * 0.45);
        } else {
            
            valorDeVenda = valor + (valor * 0.30);
        }
        
        System.out.println("O valor do produto revendido: " +valorDeVenda);
    }
}
