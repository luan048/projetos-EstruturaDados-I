class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class Ocorrencia {
    No inicio;

    int qntOcorrencias = 0;

    public void addValor(int valor) {
        No novoNo = new No(valor);

        if(inicio == null) {
            inicio = novoNo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }

    public void exibirLista() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public void contarOcorrencias(int num) {
        No atual = inicio;

        while (atual != null) {
            if(atual.valor == num) {
                qntOcorrencias++;
            }
            atual = atual.proximo;
        }

        System.out.println("O número " + num + " apareceu " + qntOcorrencias + " vezes");
    }

    public static void main(String[] args) {
        Ocorrencia lista = new Ocorrencia();

        lista.addValor(1);
        lista.addValor(2);
        lista.addValor(3);
        lista.addValor(2);
        lista.addValor(4);
        lista.addValor(2);
        lista.addValor(5);

        lista.exibirLista();

        lista.contarOcorrencias(2);
    }
}