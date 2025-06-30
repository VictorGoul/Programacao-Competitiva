//link: https://judge.beecrowd.com/en/problems/view/1531

import java.util.*;
import java.io.IOException;

public class bee1531 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        String[] numeros = input.split(" ");
        long[] arrayNumero = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            arrayNumero[i] = Long.parseLong(numeros[i].trim());
        }
        long[] numeroAtualEAnterior = new long[3];
        numeroAtualEAnterior[0] = 1L;
        numeroAtualEAnterior[1] = 0L;
        numeroAtualEAnterior[2] = 0L;
        if (arrayNumero[0] > 1) {
            for (int i = 1; i < arrayNumero[0]; i++) {
                numeroAtualEAnterior[2] = numeroAtualEAnterior[0];
                numeroAtualEAnterior[0] = numeroAtualEAnterior[1] + numeroAtualEAnterior[0];
                numeroAtualEAnterior[1] = numeroAtualEAnterior[2]; 
            }
        }
        long temp = numeroAtualEAnterior[0];
        numeroAtualEAnterior[0] = 1L;
        numeroAtualEAnterior[1] = 0L;
        numeroAtualEAnterior[2] = 0L;
        for (int i = 1; i < temp; i++) {
            numeroAtualEAnterior[2] = numeroAtualEAnterior[0];
            numeroAtualEAnterior[0] = numeroAtualEAnterior[1] + numeroAtualEAnterior[0];
            numeroAtualEAnterior[1] = numeroAtualEAnterior[2]; 
        }
        numeroAtualEAnterior[0] = numeroAtualEAnterior[0] % arrayNumero[1];
        System.out.println(numeroAtualEAnterior[0]);
    }
}