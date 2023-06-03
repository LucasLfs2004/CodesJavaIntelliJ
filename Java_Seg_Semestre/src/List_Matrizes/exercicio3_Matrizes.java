package List_Matrizes;

import java.util.Scanner;

public class exercicio3_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matriz = new int[n][m];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = 0;
        }

        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                matriz[l][c] = in.nextInt();
                b[l] += matriz[l][c];
            }
        }
        int somatoria = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " - ");
            somatoria += b[i];
        }
        System.out.println("Somatoria geral: " + somatoria);
    }
}
