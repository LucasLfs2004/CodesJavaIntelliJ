package ADO_arraylist;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero:");
            vetor[i] = in.nextInt();
        }

        System.out.println("Digite o numero a ser procurado:");
        int valorProcurado = in.nextInt();
        int posicao;

        for (int i = 0; i < 10; i++) {
            if (vetor[i] == valorProcurado) {
                posicao = i;
                System.out.println("O numero procurado se encontra na posicao " + posicao);
            }
        }
    }
}
