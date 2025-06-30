//link: https://judge.beecrowd.com/en/problems/view/3346

import java.io.IOException;
import java.util.*;

public class bee3346 {
    public static void main(String[] args) throws IOException {
        // Colocado o local para os EUA para ser aceito o output com "." ao inves de "," na variavel de saida
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in);
        String porcentagem = scan.nextLine();
        scan.close();
        String [] numeros = porcentagem.split(" ");
        double[] arrayNumero = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            arrayNumero[i] = Double.parseDouble(numeros[i].trim());
        }
        double total = (1 + arrayNumero[0] / 100.0) * (1 + arrayNumero[1] / 100.0);
        double flutuacao = (total - 1) * 100;
        System.out.printf("%.6f", flutuacao);
    }
}