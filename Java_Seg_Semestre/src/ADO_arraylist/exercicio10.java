package ADO_arraylist;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int acumulador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero:");
            vetor[i] = in.nextInt();
            if (vetor[i] < 0) acumulador++;
        }

        System.out.println("Numeros negativos: " + acumulador);
    }
}
