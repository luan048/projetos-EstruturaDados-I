import java.util.Stack;

public class Polindromo {

    public static void ehPolindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();

        // Loop que empilha
        for(int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        for(int i = 0; i < palavra.length(); i++) {
            // Se charAt(i) for diferente do elemento que será 'eliminado' ele não é polindromo
            if(palavra.charAt(i) != pilha.pop()) {
                System.out.println("Não é polindromo");
                return;
            }
        }

        System.out.println("É polindromo");
    }

    public static void main (String[] args) {
        String palavra = "paralelepipedo";
        ehPolindromo(palavra);
    }
}