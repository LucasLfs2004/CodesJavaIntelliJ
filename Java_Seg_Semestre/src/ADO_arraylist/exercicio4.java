package ADO_arraylist;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "o número:");
            vet1[i] = in.nextInt();
            vet2[i] = vet1[i];
        }
        System.out.println("### VETOR 1 ###");
        for (int r = 0; r < 5; r++) {
            System.out.println("Vetor 1 --> " +
                    (r + 1) + "o numero:" + vet1[r]);
        }
        System.out.println("### VETOR 2 ###");
        for (int r = 0; r < 5; r++) {
            System.out.println("Vetor 2 --> " +
                    (r + 1) + "o numero:" + vet2[r]);
        }
    }
}

