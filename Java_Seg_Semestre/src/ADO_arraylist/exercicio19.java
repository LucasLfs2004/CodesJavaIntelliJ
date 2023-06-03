package ADO_arraylist;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        System.out.println("Vetor 1");
        for (int i = 0; i < 5; i++) vet1[i] = in.nextInt();
        System.out.println("Vetor 2");
        for (int i = 0; i < 5; i++) vet2[i] = in.nextInt();
        System.out.println("Soma dos elementos de cada vetor, nas respectivas posicoes");
        for (int i = 0; i < 5; i++) System.out.println(vet1[i] + vet2[i]);
        System.out.println("Diferenca dos elementos de cada vetor, nas respectivas posicoes");
        for (int i = 0; i < 5; i++) System.out.println(vet1[i] - vet2[i]);
        System.out.println("Produto dos elementos de cada vetor, nas respectivas posicoes");
        for (int i = 0; i < 5; i++) System.out.println(vet1[i] * vet2[i]);
        System.out.println("Divisão dos elementos de cada vetor, nas respectivas posicoes");
        for (int i = 0; i < 5; i++) System.out.println((vet1[i] / vet2[i]));
    }
}
