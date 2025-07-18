import java.util.*;

public class multiplosPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        int imput = scan.nextInt();
        scan.close();
        int random = gen.nextInt(imput - 1) + 1;
        //random = 10;
        double resto = 0;
        int contador = 0;
        while (resto != 1) {
            contador++;
            double numero = Math.pow(random, contador);
            if ((numero % imput) == 1) {
                resto = 1;
            }
        }
        resto = imput;
        double imput1 = imput;
        double positivo, negativo;
        positivo = Math.pow(random, (contador / 2)) + 1;
        negativo = positivo - 2;
        while ((resto != 0)) {
            imput1 = resto;
            resto = positivo % imput1;
            positivo = imput1;
        }
        double primo1, primo2;
        primo1 = imput1;
        primo2 = imput / imput1;
        System.out.println("Os números primos são: " + primo1 + " e " + primo2);
    }   
}