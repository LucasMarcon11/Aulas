
package Lista8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Escreva um algoritmo que leia uma String chamada “texto” e outras duas Strings chamadas “a” e “b”. Toda
    vez que o texto contido na String “a” aparecer no texto, deve ser substituída pelo texto armazenado na String “b”.
 */
public class Exercicio5 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean stringAExisteNoTexto = false;
        
        System.out.print("Digite alguma coisa e pressione ENTER: ");
        String texto = br.readLine().toLowerCase();
        
        System.out.print("Digite algo para armazenar na String a: ");
        String a = br.readLine().toLowerCase().trim();
        
        System.out.print("Digite algo para armazenar na String b: ");
        String b = br.readLine().toLowerCase().trim();
        
        for (int i = 0; i < texto.length(); i++) {
            
            if (String.valueOf(texto.charAt(i)).equals(String.valueOf(a.charAt(0)))) {
                
                for (int j = 0; j < a.length(); j++) {
                    
                    if (String.valueOf(texto.charAt(i + j)).equals(String.valueOf(a.charAt(j)))) {
                        
                        stringAExisteNoTexto = true;
                    } 
                    
                    if (!stringAExisteNoTexto) break;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Texto original: " +texto);
        
        if (stringAExisteNoTexto) texto = texto.replace(a, b);
        else System.out.println("O valor armazenado na string \"a\" não existe na variável \"texto\".");
        
        System.out.println("Texto contendo as alterações: " +texto);
    }
}
