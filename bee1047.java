//link: https://judge.beecrowd.com/en/problems/view/1047

import java.io.IOException;
import java.util.*;

public class bee1047 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String imput = scan.nextLine();
        scan.close();
        String[] numeros = imput.split(" ");
        int[] arrayNumero = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            arrayNumero[i] = Integer.parseInt(numeros[i].trim());
        }
        int hora, minutos;
        hora = arrayNumero[2] - arrayNumero [0];
        minutos = arrayNumero[3] - arrayNumero[1];
        if (minutos < 0) {
            minutos += 60;
            hora -= 1;
        }
        if (hora < 0) {
            hora += 24;
        }
        if (minutos == 0 && hora == 0) {
            hora = 24;
        }
        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}