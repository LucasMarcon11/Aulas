
package Lista1;

import java.util.Scanner;

/* Efetuar o cálculo da quantidade de litros de combustível gastos em uma 
viagem sabendo-se que o carro faz
12km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a
velocidade média. Nota: utilizar as
seguintes fórmulas: */

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o tempo gasto com a viagem: ");
        double tempo = sc.nextDouble();
        
        System.out.println("Informe a velocidade média durante a viagem: ");
        double velocidadeMedia = sc.nextDouble();
        
        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12;
        
        System.out.println("A quantidade de litros gastos "
                + "na viagem é de: " +litrosUsados);
    }
}
