package List_Funcao;

import java.util.Scanner;

public class exercicio2_Funcao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int resultado = vetor(x, in);
        System.out.println("O valor foi encontrado " + resultado + " vezes no vetor");
    }

    public static int vetor(int x, Scanner in) {
        int[] vetor = new int[x];
        for (int i = 0; i < x; i++) {
            vetor[i] = in.nextInt();
        }
        int n = in.nextInt();
        int repeticao = 0;
        for (int i = 0; i < x; i++) {
            if (vetor[i] == n) repeticao++;
        }
        return repeticao;
    }
}