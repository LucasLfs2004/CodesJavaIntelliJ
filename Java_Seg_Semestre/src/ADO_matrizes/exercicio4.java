package ADO_matrizes;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] mat = new int[4][4];
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            for (int r = 0; r < 4; r++) {
                System.out.println("Digite o " + (r + 1) + "o número da " + (i + 1) + "o linha para a matriz:");
                mat[r][i] = in.nextInt();
            }
        }

        int contador = 1;

        for (int i = 1; i <= 4; i++) {
            int r = 0;
            contador++;
            while (r < contador) {
                soma += mat[r][i];
                r++;
            }
        }

        System.out.println("Matriz");
        for (int i = 0; i < 4; i++) {
            for (int r = 0; r < 4; r++) {
                System.out.print(mat[r][i] + " ");
            }
            System.out.println("\n Soma dos elementos abaixo da diagonal principal da matriz: " + soma);
        }
    }
}
