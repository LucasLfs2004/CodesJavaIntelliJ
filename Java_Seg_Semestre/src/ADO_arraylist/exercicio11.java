package ADO_arraylist;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        boolean[] verifica = new boolean[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero:");
            vetor[i] = in.nextInt();
            if (vetor[i] % 2 == 0) verifica[i] = true;
            else verifica[i] = false;
        }

        System.out.println("Verificcao dos numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "o numero: " + vetor[i] + " verificacao: " + verifica[i]);
        }
    }
}
