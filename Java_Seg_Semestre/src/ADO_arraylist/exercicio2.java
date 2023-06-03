package ADO_arraylist;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "o número:");
            vetor[i] = in.nextInt();
        }

        for (int r = 0; r < 10; r ++) {
            System.out.println((r + 1) + "o numero:" + vetor[r]);
        }
    }
}
