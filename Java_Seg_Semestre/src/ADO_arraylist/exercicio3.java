package ADO_arraylist;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[8];
        int numeroMaior = 0;
        int posicao = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o " + (i + 1) + "o número:");
            vetor[i] = in.nextInt();
            if(numeroMaior < vetor[i]) {
                numeroMaior = vetor[i];
                posicao = i;
            }

        }

        System.out.println("O maior número se encontra na posicao " +
                posicao + " e possui valor igual a " + numeroMaior);
    }
}
