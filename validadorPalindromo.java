import java.util.*;

public class validadorPalindromo {
    /*Problema: Escreva um método que verifique se uma string é um palíndromo (ignorando espaços, pontuação e diferenças entre maiúsculas/minúsculas).
    Exemplos:
    Entrada: "A base do teto desaba"
    Saída: true
    Entrada: "Java"
    Saída: false
    */
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String palindromo, palavra = scan.nextLine();
        scan.close();
        System.out.print("A palavra: " + palavra);
        palavra = limparPalavra(palavra);
        palindromo = inverterString(palavra);
        System.out.println(ehPalindromo(palavra, palindromo));
    }

    public static String limparPalavra (String palavra) {
        palavra = palavra.toLowerCase();
        palavra = palavra.trim().replaceAll("\\s+", "");
        return palavra;
    }

    public static String inverterString(String palindromo) {
        char[] palavra = new char[palindromo.length()];
        char[] temp = palindromo.toCharArray();
        int tamanhoPalavra = palindromo.length();
        for (int i = tamanhoPalavra; i > 0; i--) {
            palavra[i - 1] = temp[tamanhoPalavra - i];
        }
        return new String(palavra);
    }

    public static String ehPalindromo(String palavra, String palindromo) {
        char[] palavraTemp = palavra.toCharArray();
        char[] palindromTemp = palindromo.toCharArray();
        for (int i = 0; i < palindromTemp.length; i++) {
            if (palavraTemp[i] != palindromTemp[i]) {
                return " não é palindromo";
            }
        }
        return " é palindromo";
    }
}