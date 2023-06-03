package List_Matrizes;

import java.util.Scanner;

public class exercicio2_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matriz = new int[n][n];
        int[] verificaRepeticao = new int[n * n];
        boolean condicao = false;
        int registrador = 0;
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                matriz[c][l] = in.nextInt();
                verificaRepeticao[registrador] = matriz[c][l];
                registrador++;
            }
        }

        for (int r = 0; r < verificaRepeticao.length; r++) {
            for (int i = 1; i < verificaRepeticao.length; i++){
                if (verificaRepeticao[r] == verificaRepeticao[i]) {
                    condicao = true;
                }
            }
        }
        if (condicao) System.out.println("Há repetição na matriz");
    }
}
