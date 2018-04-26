package Lista5;

import java.util.Scanner;

/* Faça um Programa que tendo como dados de entrada o preço de custo de um 
produto e um código de origem, emita o preço junto de sua procedência. Caso o 
código não seja nenhum dos especificados, o produto deve ser classificado como 
importado. Código de origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 
5 ou 6 - nordeste, 7 ou 8 - Centro-oeste. */
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço do produto: ");
        double preco = sc.nextInt();

        System.out.println("Informe o código de origem (1 - Sul, "
                + "2 - Norte, 3 - Leste, 4 - Oeste, 5 ou 6 - Nordeste, 7 "
                + "ou 8 - Centro-oeste) ");
        int codigo = sc.nextInt();

        switch (codigo) {

            case 1:
                System.out.println("O preço de custo do produto é "
                        + "de R$ " + preco + " e a procedência é do Sul.");
                break;
            case 2:
                System.out.println("O preço de custo do produto é "
                        + "de R$ " + preco + " e a procedência é do Norte.");
                break;
            case 3:
                System.out.println("O preço de custo do produto é "
                        + "de R$ " + preco + " e a procedência é do Leste.");
                break;
            case 4:
                System.out.println("O preço de custo do produto é "
                        + "de R$ " + preco + " e a procedência é do Oeste.");
                break;
            case 5: case 6:
                System.out.println("O preço de custo do produto é "
                        + "de R$ " + preco + " e a procedência é do Nordeste.");
                break;
            case 7: case 8:
                System.out.println("O preço de custo do produto é "
                        + "de R$ " + preco + " e a procedência é do Centro-oeste.");
                break;
            default: 
                
                System.out.println("O preço de custo do produto é "
                        + "de R$ " + preco + " e a procedência é importada.");
                break;
        }
    }
}
