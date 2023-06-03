package List_Matrizes;

import java.util.Scanner;

public class exercicio6_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o numero de linhas da matriz:");
        int n = in.nextInt();
        System.out.println("Insira o numero de colunas da matriz:");
        int m = in.nextInt();
        int[][] matriz = new int[n][m];


        System.out.println("Insira os valores da matriz:");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                matriz[l][c] = in.nextInt();
            }
        }
        int menor = matriz[0][0];

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                if (matriz[l][c] < menor) menor = matriz[l][c];
            }
        }

        System.out.println("O menor elemento da matriz é: " + menor);
    }
}

