import java.util.ArrayList;

class No {
    int valor;

    No proximo;
    No anterior;

    No(int valor) {
        this.valor = valor;
    }
}

public class Polindromo {
    ArrayList<Integer> listaNormal = new ArrayList<>();
    ArrayList<Integer> listaInversa = new ArrayList<>();

    No cabeca;

    public void addValue(int valor) {
        No novoNo = new No(valor);

        if(cabeca == null ) {
            cabeca = novoNo;
            return;
        }

        No atual = cabeca;
        while (atual.proximo != null ) {
            atual = atual.proximo;
        }

        atual.proximo = novoNo;
        novoNo.anterior = atual;
    }

    public void listagem() {
        No atual = cabeca;

        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            listaNormal.add(atual.valor);
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public void listagemInversa() {
        if(cabeca == null) {
            System.out.println("Lista está vazia!");
            return;
        }

        No atual = cabeca;

        // Leva para ultimo elemento da lista
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        // Lista e volta os elementos da lista
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            listaInversa.add(atual.valor);
            atual = atual.anterior;
        }
        System.out.println("null");
    }

    public void ehPolindromo() {
        int qntIguais = 0;

        for(int i = 0; i < listaNormal.size(); i++) {
            if(listaNormal.get(i).equals(listaInversa.get(i))) {
                qntIguais++;
            }
        }

        if(qntIguais == listaNormal.size()) {
            System.out.println("É polindromo!");
        }
        else {
            System.out.println("Não é polindromo!");
        }
    }

    public static void main (String[] args) {
        Polindromo list = new Polindromo();

        list.addValue(1);
        list.addValue(2);
        list.addValue(3);
        list.addValue(4);
        list.addValue(5);

        list.listagem();
        list.listagemInversa();
        list.ehPolindromo();
    }
}