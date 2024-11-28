class ListaLigada {
    No primeiro;

    ListaLigada() {
        primeiro = null;
    }

    public void addNumero(int chave) {
        if(primeiro == null) {
            primeiro = new No(chave);
            return;
        }

        No novo = new No(chave);
        no.proximo = primeiro;
        primeiro = novo;
    }

    // Adicionar REMOVE IMPAR
}

public class NumerosPares {
    public static void main (String[] args) {
    }
}