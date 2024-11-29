class No {
    int value;

    No anterior;
    No proximo;

    No(int value) {
        this.value = value;
    }
}

class Inverso {
    No cabeca;

    public void addValue(int value) {
        No novoNo = new No(value);

        if(cabeca == null) {
            cabeca = novoNo;
            return;
        }

        No atual = cabeca;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novoNo;
        novoNo.anterior = atual;
    }

    public void listagemInversa() {
        if(cabeca == null) {
            System.out.println("Lista está vazia!");
            return;
        }

        No atual = cabeca;

        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        System.out.println("Lista inversa: ");

        while (atual != null) {
            System.out.println(atual.value + " ");
            atual = atual.anterior;
        }
    }

    public static void main(String[] args) {
        Inverso list = new Inverso();

        list.addValue(10);
        list.addValue(20);
        list.addValue(30);
        list.addValue(40);

        list.listagemInversa(); // Imprime lista inversa
    }
}