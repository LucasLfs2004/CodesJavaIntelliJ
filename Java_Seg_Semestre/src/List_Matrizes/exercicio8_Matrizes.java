package List_Matrizes;

import java.util.Scanner;

public class exercicio8_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o numero de linhas e colunas da matriz:");
        int n = in.nextInt();
        int[][] matriz = new int[n][n];
        int soma = 0;
        boolean verificacao = true;
        int registrador = 0;
        int r = 0;
        System.out.println("Insira os valores da matriz:");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                matriz[l][c] = in.nextInt();
            }
        }

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                soma += matriz[l][c];
            }
            if (l == 0) registrador = soma;
            if (registrador == soma) verificacao = true;
            else verificacao = false;
            soma = 0;
        }

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                soma += matriz[c][l];
            }
            if (registrador == soma) verificacao = true;
            else verificacao = false;
            soma = 0;
        }
        for (int i = 0; i < n; i++) {
            soma += matriz[i][i];
            if (registrador == soma) verificacao = true;
            else verificacao = false;
        }
        soma = 0;

        for (int i = n - 1; i >= 0; i--) {
            soma += matriz[r][i];

            if (registrador == soma) verificacao = true;
            else verificacao = false;
            r++;
        }
        if (verificacao == true)
            System.out.println("A matriz é um quadrado mágico");
        else
            System.out.println("A matriz não é um quadrado mágico");
    }
}
