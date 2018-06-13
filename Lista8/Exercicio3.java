
package Lista8;

import java.util.Scanner;

/**
 *
 * Escreva um algoritmo que leia duas Strings. Após isso, o programa deve concatenar as informações
    lidas e mostrar o resultado para o usuário.
    Exemplo: Se a primeira String digitada for "Bom dia, " e a segunda "moçada!", então o resultado
    deverá ficar: "Bom dia, moçada!".
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite alguma coisa e pressione ENTER: ");
        String texto1 = s.next();
        
        System.out.print("Digite mais alguma coisa e pressione ENTER: ");
        String texto2 = s.next();
        
        System.out.println("O resultado da concatenação das duas mensagens é: " +(texto1 + texto2));
    }
}
