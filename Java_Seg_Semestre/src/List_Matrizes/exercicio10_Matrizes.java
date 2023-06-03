package List_Matrizes;

import java.util.Scanner;

public class exercicio10_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da matriz:");
        int m = in.nextInt();
        int[][] matriz = new int[m][m];
        int r = 0;

        //Condição 1
        System.out.println("a)");
        matriz = preencherZero(matriz, m);
        for (int i = 0; i < m; i++) {
            matriz[i][i] = 1;
        }
        exibirMatriz(matriz, m);

        //Condição 2
        System.out.println("\nb)");
        matriz = preencherZero(matriz, m);
        for (int i = m - 1; i >= 0; i--) {
            matriz[r][i] = 1;
            r++;
        }
        exibirMatriz(matriz, m);

        //Condição 3
        System.out.println("\nc)");
        matriz = preencherZero(matriz, m);
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < m; c++) {
                if (l == 0 || l == (m - 1)) {
                    matriz[l][c] = 1;
                }
                if (c == 0 || c == (m - 1)) {
                    matriz[l][c] = 1;
                }
            }
        }
        exibirMatriz(matriz, m);

        //Condição 4
        System.out.println("\nd)");
        matriz = preencherUm(matriz, m);
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < l; c++) {
                matriz[c][l] = 0;
            }
        }
        exibirMatriz(matriz, m);

        //Condição 5
        System.out.println("\ne)");
        matriz = preencherZero(matriz, m);
        r = 0;
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < l; c++) {
                matriz[l][c] = 1;
            }
        }
        exibirMatriz(matriz, m);
    }

    public static int[][] preencherZero(int[][] matriz, int m) {
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < m; c++) {
                matriz[l][c] = 0;
            }
        }
        return matriz;
    }

    public static int[][] preencherUm(int[][] matriz, int m) {
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < m; c++) {
                matriz[l][c] = 1;
            }
        }
        return matriz;
    }

    public static void exibirMatriz(int[][] matriz, int m) {
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < m; c++) {
                System.out.print(matriz[l][c] + " - ");
            }
            System.out.println();
        }
    }
}
