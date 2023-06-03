package ADO_arraylist;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int i = 0;
        int r;
        boolean verifica;

        while (i < 10) {
            vetor[i] = in.nextInt();
            verifica = true;
            r = 0;
            int contador = vetor.length - 1;
            while (verifica && r < vetor.length) {
                if (i != r) {
                    if (vetor[i] == vetor[r]) verifica = false;
                }
                r++;
                if (r == vetor.length) i++;
            }
            System.out.println("Insira um valor direfente dos inseridos anteriormente");
        }
        for (int q = 0; q < vetor.length; q++) {
            System.out.println((q + 1) + "o numero:" + vetor[q]);
        }
    }
}

