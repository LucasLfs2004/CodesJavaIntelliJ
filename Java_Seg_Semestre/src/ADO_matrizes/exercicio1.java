import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantas linhas as matrizes deve ter?");
        int linha = in.nextInt();
        System.out.println("Quantas colunas as matrizes devem ter");
        int coluna = in.nextInt();
        int[][] matriz1 = new int[coluna][linha];
        int[][] matriz2 = new int[coluna][linha];
        int[][] soma = new int[coluna][linha];

        for (int i = 0; i < linha; i++) {
            for (int r = 0; r < coluna; r++) {
                System.out.println("Digite o " + (r + 1) + "o número da " + (i + 1) + "o linha para a matriz 1:");
                matriz1[r][i] = in.nextInt();
                System.out.println("Digite o " + (r + 1) + "o número da " + (i + 1) + "o linha para a matriz 2:");
                matriz2[r][i] = in.nextInt();
                soma[r][i] = matriz1[r][i] + matriz2[r][i];
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int r = 0; r < coluna; r++) {
                System.out.println("Soma das matrizes, linha " + (i + 1) + " e coluna " + (r + 1) + ":");
                System.out.println(soma[r][i]);
            }
        }
    }
}
