import java.util.Stack;

public class Inversao {

    public static void invertePalavra(String palavra) {
        Stack<Character> pilha = new Stack<>();

        for(int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        System.out.println("Palavra normal: " + palavra);

        System.out.print("Palavra invertida: ");
        for(int i = 0; i < palavra.length(); i++) {
            System.out.print(pilha.pop());
        }
    }

    public static void main (String[] args) {
        String palavra = "exemplo";

        invertePalavra(palavra);
    }
}