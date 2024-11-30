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

        // Enquanto pilha tiver valores
        while (!pilha.isEmpty()) {
            if(elementoAtual == pilha.peek()) { // Se o elementos atual é igual ao topo de pilha
                contador++;
                pilha.pop(); // Apaga elemento após adicionar +1 ao contador
            }
            /*Se for diferente, vai imprimir a quantidade de vezes que o elementos anterior apareceu, vai apagar
            * o topo da pilha, vai resetar contador = 1*/
            else {
                System.out.println(elementoAtual + " -> " + contador + " vezes");
                elementoAtual = pilha.pop();
                contador = 1;
            }
        }

        System.out.println(elementoAtual + " -> " + contador + " vezes"); //Para listar o ultimo elemento
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