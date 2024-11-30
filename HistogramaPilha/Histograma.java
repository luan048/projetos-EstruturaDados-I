import java.util.Stack;

public class Histograma  {
    Stack<Integer> pilha = new Stack<>();

    public void addValue(int valor) {
        pilha.push(valor);
    }

    public void listarHistograma() {
        if(pilha.isEmpty()) {
            System.out.println("Pilha está vazia!");
            return;
        }

        int elementoAtual = pilha.pop();
        int contador = 1;

        while (!pilha.isEmpty()) {
            if(elementoAtual == pilha.peek()) {
                contador++;
                pilha.pop();
            }
            else {
                System.out.println(elementoAtual + " -> " + contador + " vezes");
                elementoAtual = pilha.pop();
                contador = 1;
            }
        }

        System.out.println(elementoAtual + " -> " + contador + " vezes");
    }
    public static void main (String[] args) {
        Histograma temperatura = new Histograma();

        temperatura.addValue(30);
        temperatura.addValue(30);
        temperatura.addValue(30);
        temperatura.addValue(25);
        temperatura.addValue(25);
        temperatura.addValue(35);
        temperatura.addValue(35);
        temperatura.addValue(35);
        temperatura.addValue(35);

        temperatura.listarHistograma();

    }
}