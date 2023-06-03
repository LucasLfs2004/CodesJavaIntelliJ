package ADO_BuscaBinaria;

import java.util.Random;
import java.util.Scanner;

public class ADO6_Busca_Binaria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[100];

        Random gerador = new Random();
        for (int i = 0; i < 100; i++) {
            vetor[i] = gerador.nextInt(1000);
        }

        bubbleSort(vetor);

        for (int i = 0; i < 100; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("Digite o número que deseja buscar:");
        int busca = in.nextInt();

        int posicao = buscaBinaria(vetor, busca);

        if (posicao > -1)
            System.out.println("O número procurado se encontra na  " + posicao);
        else
            System.out.println("O número buscado não se encontra no vetor");
    }

    public static void bubbleSort(int[] vetor) {
        int aux = 0;

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static int buscaBinaria(int vetor[], int x) {
        int i, m, f;
        i = 0;
        f = vetor.length - 1;
        while (i <= f) {
            m = (i + f) / 2;
            if (vetor[m] == x)
                return m;
            if (x < vetor[m])
                f = m - 1;
            else
                i = m + 1;
        }
        return -1;
    }
}
