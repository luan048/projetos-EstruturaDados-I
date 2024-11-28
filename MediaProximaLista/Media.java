public class Media {

    public void MediaMProxima(int[] array) {
        int soma = 0;
        float mediaArray = 0;
        float menorDiferenca = array[0];
        int elementoMenorDife = array[0];

        // Soma elementos
        for(int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        // Calculo Media
        mediaArray = (float) soma / array.length;

        // Registra menor diferença
        for(int i = 0; i < array.length; i++) {
            float diferenca = Math.abs(mediaArray - array[i]);

            if(diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                elementoMenorDife = array[i];
            }
        }

        System.out.println(elementoMenorDife);
    }

    public static void main (String[] args) {
        Media media = new Media();

        int[] arrayNum = new int[]{7, 5, 9, 8};

        media.MediaMProxima(arrayNum);
    }
}