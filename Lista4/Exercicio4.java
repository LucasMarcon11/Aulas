package Lista4;

import java.util.Scanner;

/**
 *
 * Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
 * usuário a valor do saque e depois informar quantas notas de cada valor serão
 * fornecidas. As notas disponíveis serão as de 2, 5, 10, 20, 50 e 100 reais. O
 * valor mínimo é de 10 reais. O programa não deve se preocupar com a quantidade
 * de notas existentes na máquina.  *
 */
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu saldo: ");
        int saldo = sc.nextInt();

        System.out.print("Informe o valor do saque: ");
        int saque = sc.nextInt();

        if (saque > saldo) {

            System.out.println("Valor indisponível!");
        } else {

            if (saque < 10) {

                System.out.println("O saque não obedece o valor mínimo requisitado!");
            } else {

                int cem;
                int cinquenta;
                int vinte;
                int dez;
                int cinco = 0;
                int dois;
                int resto;

                cem = saque / 100;
                resto = saque % 100;

                cinquenta = resto / 50;
                resto = resto % 50;

                vinte = resto / 20;
                resto %= 20;

                dez = resto / 10;
                resto %= 10;

                if ((saque % 2) == 0) {

                    dois = resto / 2;
                    resto %= 2;
                } else {

                    cinco = resto / 5;
                    resto %= 5;

                    dois = resto / 2;
                    resto %= 2;
                }

                if (cem > 0) {

                    System.out.println(cem + " nota(s) de R$ 100,00.");
                }
                if (cinquenta > 0) {

                    System.out.println(cinquenta + " nota(s) de R$ 50,00.");
                }
                if (vinte > 0) {

                    System.out.println(vinte + " nota(s) de R$ 20,00.");
                }
                if (dez > 0) {

                    System.out.println(dez + " nota(s) de R$ 10,00.");
                }
                if (cinco > 0) {

                    System.out.println(cinco + " nota(s) de R$ 05,00.");
                }
                if (dois > 0) {

                    System.out.println(dois + " nota(s) de R$ 02,00.");
                }
            }
        }
    }
}
