import java.util.Arrays;

public class SegMaior {

    public void ordenarLista(int[] numeros) {

        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < i; j++) {
                if(numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];

                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("O segundo maior é " + numeros[numeros.length - 2]);
    }
    public static void main(String[] args) {
        SegMaior numeros = new SegMaior();

        int[] arrayNumeros = new int[] {5, 1, 9, 3, 7};

        numeros.ordenarLista(arrayNumeros);

    }
}