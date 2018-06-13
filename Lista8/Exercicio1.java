
package Lista8;

import java.util.Scanner;

/**
 *
 * Elabore um algoritmo para testar se uma senha digita é igual a “batatafrita”. Se a senha estiver correta
    escreva “Acesso permitido”, do contrario emita a mensagem “Você não tem acesso ao sistema”.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe a senha: ");
        String senha = s.next();
        
        if (senha.equals("batatafrita")) System.out.println("Acesso permitido.");
        else System.out.println("Você não tem acesso ao sistema.");
    }
}
