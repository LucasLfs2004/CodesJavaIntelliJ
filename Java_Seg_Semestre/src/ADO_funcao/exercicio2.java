package ADO_funcao;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantas linhas as matrizes deve ter?");
        int linha = in.nextInt();
        System.out.println("Quantas colunas as matrizes devem ter");
        int coluna = in.nextInt();
        int[][] matriz = new int[coluna][linha];
        int[][] matrizTransposta = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int r = 0; r < coluna; r++) {
                System.out.println("Digite o " + (r + 1) + "o número da " + (i + 1) + "o linha para a matriz 1:");
                matriz[r][i] = in.nextInt();
                matrizTransposta[i][r] = matriz[r][i];
            }
        }

        System.out.println("Matriz original");
        for (int i = 0; i < linha; i++) {
            for (int r = 0; r < coluna; r++) {
                System.out.print(matriz[r][i] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz Transposta");
        for (int i = 0; i < coluna; i++) {
            for (int r = 0; r < linha; r++) {
                System.out.print(matrizTransposta[r][i] + " ");
            }
            System.out.println();
        }
    }
}