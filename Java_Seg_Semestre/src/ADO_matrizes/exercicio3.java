package ADO_matrizes;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] mat = new int[2][3];
        int[] somaLinhas = new int[3];
        int somaTotal = 0;

        for (int i = 0; i < 3; i++) {
            for (int r = 0; r < 2; r++) {
                System.out.println("Digite o " + (r + 1) + "o número da " + (i + 1) + "o linha para a matriz 1:");
                mat[r][i] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int r = 0; r < 2; r++) {
                somaLinhas[i] += mat[r][i];
            }
            somaTotal += somaLinhas[i];
        }
        System.out.println("Soma da matriz: " + somaTotal);
    }
}
