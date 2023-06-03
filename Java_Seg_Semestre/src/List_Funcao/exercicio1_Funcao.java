package List_Funcao;

import java.util.Scanner;

public class exercicio1_Funcao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int resultado = vetor(x, in);
        System.out.println("O valor é encontrado no indice " + resultado + " do vetor");
    }

    public static int vetor(int x, Scanner in) {
        int[] vetor = new int[x];
        for (int i = 0; i < x; i++) {
            vetor[i] = in.nextInt();
        }
        int n = in.nextInt();
        int indice = -1;
        for (int i = 0; i < x; i++) {
            if (vetor[i] == n) indice = i;
        }
        return indice;
    }
}
