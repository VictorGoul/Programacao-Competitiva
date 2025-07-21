import java.util.*;

public class multiplosPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        int imput = scan.nextInt();
        scan.close();
        boolean flag = true;
        double imput1 = 0;
        Set<Integer> numeros = new HashSet<>();
        while (flag == true){
            int c = numeros.size(), c1 = numeros.size();
            int random = 0;
            while (c == c1) {
                random = gen.nextInt(imput - 1) + 1;
                numeros.add(random);
                c1 = numeros.size();
            }
            System.out.println(random);
            double resto = 0;
            int contador = 0;
            while (resto != 1) {
                contador++;
                double numero = Math.pow(random, contador);
                if ((numero % imput) == 1) {
                    resto = 1;
                }
                if (Double.isNaN(numero) || Double.isInfinite(numero)) {
                    break;
                }
            }
            resto = imput;
            imput1 = imput;
            double positivo, negativo;
            positivo = Math.pow(random, (contador / 2)) + 1;
            negativo = positivo - 2;
            while ((resto != 0)) {
                imput1 = resto;
                resto = positivo % imput1;
                positivo = imput1;
            }
            if (positivo != 1 && positivo != imput){
                flag = false;
            }
        }
        double primo1, primo2;
        primo1 = imput1;
        primo2 = imput / imput1;
        System.out.println("Os números primos são: " + primo1 + " e " + primo2);
    }
}