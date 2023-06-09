package List_4;

public class QuickSort {
    public static void main(String[] args) {

        int tamanho = 100;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * tamanho);
        }

        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
