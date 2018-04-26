
package Lista1;

// Escreva um algoritmo para ler um número e mostre na 
// tela seu sucessor e seu antecessor.
import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        int numero = entrada.nextInt();
        
        System.out.println("O número é: " +numero+ " e seu antecessor é: "
                + ""+(numero - 1)+" e seu sucessor é: " +(numero + 1));
    }
}
