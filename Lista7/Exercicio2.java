
package Lista7;

import java.util.Scanner;

/**
 *
 * Escreva uma classe em Java que apresente quatro opções: (a) consulta saldo, (b) saque e (c)
    depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor do saldo deve
    ser atualizado.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double saldo = 0;
        
        while (true) {
            
            System.out.print("\nInforme a operação (a - consultar saldo || b - sacar || c - depositar || d - sair): ");
            String op = s.next();
            
            switch(op) {
                
                case "a":
                    System.out.println("Saldo atual: " +saldo);
                    break;
                    
                case "b":
                    while (true) {
                        
                        System.out.print("Informe o valor a ser sacado ou pressione c para cancelar a operação: ");
                        String valor = s.next().toLowerCase();
                        
                        if (valor.equals("c")) break;
                        else if (Double.parseDouble(valor) > saldo) System.out.println("Não é possível sacar um valor superior ao saldo!\n");
                        else {

                            saldo -= Double.parseDouble(valor);
                            break;
                        }
                    } break;
                    
                case "c":
                    while (true) {
                        
                        System.out.print("Informe o valor de depósito ou c para cancelar a operação: ");
                        String valor = s.next().toLowerCase();
                        
                        if (valor.equals("c")) break;
                        else if (Double.parseDouble(valor) < 0) System.out.println("Não é possível depositar um valor negativo!\n");
                        else if (Double.parseDouble(valor) == 0) System.out.println("Não é possível depositar um valor nulo!\n");
                        else {
                            
                            saldo += Double.parseDouble(valor);
                            break;
                        }
                    } break;
                    
                case "d":
                    System.out.println("Você saiu do sistema.");
                    System.exit(0);
                    
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }
    }
}
