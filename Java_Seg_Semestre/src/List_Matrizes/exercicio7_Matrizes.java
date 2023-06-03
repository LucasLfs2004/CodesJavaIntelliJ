package List_Matrizes;

import java.util.Scanner;

public class exercicio7_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o numero de linhas da matriz:");
        int n = in.nextInt();
        System.out.println("Insira o numero de coluna da matrize:");
        int m = in.nextInt();
        int[][] matriz = new int[n][m];


        System.out.println("Insira os valores da matriz:");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                matriz[l][c] = in.nextInt();
            }
        }
        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                    linha = l;
                    coluna = c;
                }
            }
        }

        System.out.println("O maior elemento da matriz é " + maior +
                " e está localizado na linha " + linha + " e na coluna " + coluna);
    }
}

