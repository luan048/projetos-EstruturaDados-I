import java.util.ArrayList;

public class Produto {

    public void calculateProduto(int[] numeros) {
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                lista.add(numeros[i]);
            }
        }

        // Transforma a lista em array
        int[] numerosPares = new int[lista.size()];
        for(int i = 0; i < lista.size(); i++) {
            numerosPares[i] = lista.get(i);
        }

        // Produto do array dos pares
        int multiplicacao = 1;
        for(int i = 0; i < numerosPares.length; i++) {
            multiplicacao *= numerosPares[i];
        }

        System.out.println(multiplicacao);
    }

    public static void main (String[] args) {
        Produto numeros = new Produto();

        int[] arrayNumeros = new int[] {2, 3, 4, 5, 6};

        numeros.calculateProduto(arrayNumeros);
    }
}