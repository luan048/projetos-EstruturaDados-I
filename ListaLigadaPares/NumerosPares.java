class No {
    No proximo; // Referencia ao elemetos seguinte do Nó
    int valor; // Valor que vai estar dentro do Nó

    No(int valor) {
        this.valor = valor;
        this.proximo = null; // O proximo elementos vai começar null
    }
}

public class NumerosPares {
    No inicio; // Primeiro No da lista

    // Metodo para adicionar valor na lista
    public void adicionarValor(int valor) {
        No novoNo = new No(valor);

        if(inicio == null) {
            inicio = novoNo;
            return;
        }

        // Se não for null, vai passar até encontrar um null e adicionar o novoNo na lista
        No atual = inicio;
        while (atual.proximo != null ) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }

    // Metodo para remover valores impares
    public void removeValor() {
        while (inicio != null && inicio.valor % 2 != 0) { // Somente se o PRIMEIRO elemento for impar
            inicio = inicio.proximo;
        }

        No atual = inicio;

        while (atual != null && atual.proximo != null) {
            if(atual.proximo.valor % 2 != 0) { // Se elemento atual e prox forem impares, vai ser ignorado
                atual.proximo = atual.proximo.proximo;
                return;
            }

            atual = atual.proximo; // Se for par, somentos segue para o prox
        }
    }

    public void exibirLista () {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        NumerosPares lista = new NumerosPares();

        lista.adicionarValor(1);
        lista.adicionarValor(2);
        lista.adicionarValor(3);
        lista.adicionarValor(4);
        lista.adicionarValor(5);
        lista.adicionarValor(6);
        lista.adicionarValor(6);
        lista.adicionarValor(9);

        System.out.println("Lista original: ");
        lista.exibirLista();

        System.out.println();

        System.out.println("Lista após remoção: ");
        lista.removeValor();
        lista.exibirLista();
    }
}