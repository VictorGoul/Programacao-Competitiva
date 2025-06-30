import java.util.*;

public class buscaEmArray {
    /*Problema: Implemente uma busca binária em um array ordenado de inteiros. Retorne o índice do elemento se encontrado, ou -1 se não encontrado.
    Exemplo:
    Entrada: [1, 3, 5, 7, 9], 5
    Saída: O elementos que são iguais a 5 são os indices: 2
    Entrada: [1, 3, 5, 7, 9], 4
    Saída: Nenhum elemento igual a 5 foi encontrado
    */
    public static void main(String[] args) {
        System.out.println("Escreva o array de entrada dessa forma: [1, 3, 0, 4], 1");
        Scanner scan = new Scanner(System.in);
        String numerosString = scan.nextLine();
        scan.close();
        int [] array = transformandoArrayemNumero(numerosString);
        int [] indiceElemento = buscaBinaria(array, array[(array.length - 1)]);
        if (indiceElemento.length > 0) {
            System.out.println("O elementos que são iguais ao " + array[array.length - 1] + " são os indices:");
            for (int i = 0; i < indiceElemento.length; i++) {
                System.out.println(" " + indiceElemento[i]);
            }
        }
        else {
            System.out.println("Nenhum elemento igual a " + array[array.length - 1] + " foi encontrado");
        }
    }

    public static int [] buscaBinaria (int[] array, int numero){
        // Se posição = -1 não tem no array o número buscado
        List <Integer> lista = new ArrayList<>(0);
        for (int i = 0; i < (array.length - 1); i++) {
            if (numero == array[i]) {
                 lista.add(i);
            }
        }
        int [] resultado = new int [lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }
        return resultado;
    }

    public static int [] transformandoArrayemNumero (String numeroString) {
        numeroString = numeroString.replace("[", "").replace("]", "").replaceAll("\\s", "");
        String[] numeros = numeroString.split(",");
        int[] arrayNumero = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            arrayNumero[i] = Integer.parseInt(numeros[i].trim());
        }
        return arrayNumero;
    }
}