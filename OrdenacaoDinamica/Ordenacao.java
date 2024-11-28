import java.util.Arrays;

public class Ordenacao {

    public void ordenacaoVetor(int tamanhoArray, String numeros) {
        int[] vetor = new int[tamanhoArray];

        String[] arrayNumeros = numeros.split(",");

        int[] arrayNumerosInt = new int[arrayNumeros.length];
        // Loop para converter arrayNumeros para int
        for(int i = 0; i < arrayNumeros.length; i++) {
            arrayNumerosInt[i] = Integer.parseInt(arrayNumeros[i].trim());
        }

        //Loop para inserir
        for(int i = 0; i < tamanhoArray; i++) {
            vetor[i] = arrayNumerosInt[i];

            // Loop para ordenação
            for(int j = 0; j < i; j++) {
                for(int k = 0; k < i; k++) {
                    if(vetor[k] > vetor[k + 1]) {
                        int temp = vetor[k];

                        vetor[k] = vetor[k + 1];
                        vetor[k + 1] = temp;
                    }
                }

                System.out.println(Arrays.toString(vetor));
            }
        }


    }

    public static void main (String[] args) {

        Ordenacao ordenacao = new Ordenacao();

        ordenacao.ordenacaoVetor(5, "1, 8, 2, 5, 7");
    }
}