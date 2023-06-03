package ADO_arraylist;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] vetor = new double[20];
        double media = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i + 1) + "o número:");
            vetor[i] = in.nextDouble();
            media += vetor[i];
        }

        double mediaCalculada = media / 20;

        System.out.println("Média dos valores inseridos: " + mediaCalculada);
        System.out.println("## Valores menores que a média ##");
        for (int i = 0; i < 20; i++) {
            if (vetor[i] < mediaCalculada) System.out.println(vetor[i]);
        }
    }
}
