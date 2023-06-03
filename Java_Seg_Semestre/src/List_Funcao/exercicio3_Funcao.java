package List_Funcao;

import java.util.Scanner;

public class exercicio3_Funcao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int resultado = vetor(x, in);
        System.out.println("No vetor há " + resultado + " números impares");
    }

    public static int vetor(int x, Scanner in) {
        int[] vetor = new int[x];
        for (int i = 0; i < x; i++) {
            vetor[i] = in.nextInt();
        }
        int impar = 0;
        for (int i = 0; i < x; i++) {
            if (vetor[i] % 2 == 1) impar++;
        }
        return impar;
    }
}