package List_Funcao;

import java.util.Scanner;

public class exercicio7_Funcao {
    static Scanner in = new Scanner(System.in);
    static int linha = 4;
    static int coluna = 3;
    public static void main(String[] args) {

        int[][] matriz = matrizOriginal();
        int[][] matrizTransposta = matrizTransposta(matriz);
        System.out.println("Matriz transposta:");
        for (int i = 0; i < coluna; i++) {
            for (int r = 0; r < linha; r++) System.out.print(matrizTransposta[r][i] + "  ");
            System.out.println();
        }
    }

    public static int[][] matrizOriginal() {
        int[][] matriz = new int[coluna][linha];
        for (int i = 0; i < linha; i++) {
            for (int r = 0; r < coluna; r++) {
                System.out.println("Digite o " + (r + 1) + "o número da " + (i + 1) + "o linha para a matriz:");
                matriz[r][i] = in.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] matrizTransposta(int[][] matriz) {
        int[][] matrizTransposta = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int r = 0; r < coluna; r++) {
                matrizTransposta[i][r] = matriz[r][i];
            }
        }
        return matrizTransposta;
    }
}