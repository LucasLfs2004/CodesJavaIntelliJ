package TESTE_CIT;

import java.util.Scanner;

public class teste_Ordenacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = {11, 4, 5, 7, 2};

        bubbleSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }
    }

    public static void bubbleSort(int[] vetor) {
        int aux = 0;

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] % 2 == 1) {
                    aux = vetor[j];
                    vetor [j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
}
