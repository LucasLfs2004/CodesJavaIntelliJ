package ADO_arraylist;

import java.util.Scanner;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamanho = 10;
        int[] vet1 = new int[tamanho];
        int[] vet2 = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "o número:");
            vet1[i] = in.nextInt();
            vet2[tamanho - (i + 1)] = vet1[i];
        }

        System.out.println("### VETOR 1 ###");
        for (int r = 0; r < tamanho; r++) {
            System.out.println("Vetor 1 --> " +
                    (r + 1) + "o numero:" + vet1[r]);
        }
        System.out.println("### VETOR 2 ###");
        for (int r = 0; r < tamanho; r++) {
            System.out.println("Vetor 2 --> " +
                    (r + 1) + "o numero:" + vet2[r]);
        }
    }
}
