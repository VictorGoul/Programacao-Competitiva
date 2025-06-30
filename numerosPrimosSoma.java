import java.util.*;

public class numerosPrimosSoma {
    /*Problema: Escreva um método que receba um número inteiro N e retorne a soma de todos os números primos menores que N.
    Exemplo:
    Entrada: 10
    Saída: 2 + 3 + 5 + 7 = 17
    */
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        System.out.println("A soma de todos os números primos menores que " + numero + " é igual: " + somaPrimos(numero));
    }

    public static long somaPrimos(int numero) {
        long soma = 0;
        for (int i = 1; i < numero; i++) {
            soma += identificadorPrimo(i);
        }
        return soma;
    }

    public static long identificadorPrimo(long numero) {
        long valor = numero;
        if (numero == 1) {
                valor = 0;
                return valor;
        }
        for (long i = 2; i <= (Math.sqrt(valor)); i++) {
            if ((numero % i) == 0) {
                valor = 0;
                break;
            }
        }
        return valor;
    }
}