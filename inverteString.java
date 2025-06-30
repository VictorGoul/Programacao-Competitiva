import java.util.*;

public class inverteString {
    /*Problema: Escreva um método que receba uma string e retorne a mesma string com os caracteres em ordem inversa.
    Exemplo:
    Entrada: "Java"
    Saída: "avaJ"
    */
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();
        System.out.println("A palavra ao contrario é:" + inverterString(palavra));
    }
    
    public static String inverterString(String palindromo) {
        // Implemente sua solução aqui
        char[] palavra = new char[palindromo.length()];
        char[] temp = palindromo.toCharArray();
        int tamanhoPalavra = palindromo.length();
        for (int i = tamanhoPalavra; i > 0; i--) {
            palavra[i - 1] = temp[tamanhoPalavra - i];
        }
        return new String(palavra);
    }
}