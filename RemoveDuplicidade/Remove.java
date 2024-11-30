import java.util.ArrayList;
import java.util.Arrays;

public class Remove {

    public void RemoveDuplicidade(int[] vetor) {
        ArrayList<Integer> novoVetor = new ArrayList<>();

        for(int num : vetor) {
            if(!novoVetor.contains(num)) {
                novoVetor.add(num);
            }
        }

        System.out.print("Lista com duplicidade: ");
        System.out.println(Arrays.toString(vetor));

        System.out.println();

        System.out.print("Lista sem duplicidade");
        System.out.println(novoVetor);
    }
    public static void main (String[] args) {
        int[] vetor = new int[]{1, 2, 2, 3, 4, 4, 5};

        Remove removeRepeticao = new Remove();
        removeRepeticao.RemoveDuplicidade(vetor);

    }
}