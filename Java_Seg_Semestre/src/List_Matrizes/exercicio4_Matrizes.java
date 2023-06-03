package List_Matrizes;

import java.util.Scanner;

public class exercicio4_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o numero de linhas das matrizes:");
        int n = in.nextInt();
        System.out.println("Insira o numero de colunas das matrizes:");
        int m = in.nextInt();
        int[][] matrizA = new int[n][m];
        int[][] matrizB = new int[n][m];
        int[][] matrizC = new int[n][m];

        System.out.println("Insira os valores da matriz A:");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                matrizA[l][c] = in.nextInt();
            }
        }

        System.out.println("Insira os valores da matriz B:");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                matrizB[l][c] = in.nextInt();
                matrizC[l][c] = matrizA[l][c] - matrizB[l][c];
            }
        }

        System.out.println("Matriz C = A - B");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                System.out.print(matrizC[l][c] + "  ");
            } System.out.println();
        }
    }
}