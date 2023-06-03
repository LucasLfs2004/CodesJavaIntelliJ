package ADO_arraylist;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] vetor = new double[10];
        double[] quadrado = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero:");
            vetor[i] = in.nextDouble();
            quadrado[i] = Math.pow(vetor[i], 2);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "o numero: " + vetor[i]);
            System.out.println((i + 1) + "o numero ao quadrado: " + quadrado[i]);
        }
    }
}
