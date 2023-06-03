package List_Matrizes;

import java.util.Scanner;

public class exercicio9_Matrizes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o numero de linhas da matriz:");
        int m = in.nextInt();
        System.out.println("Insira o numero de colunas da matriz:");
        int n = in.nextInt();
        int[][] matriz = new int[m][n];
        int somaPares = 0;
        int somaImpares = 0;
        int produtoImpares = 1;
        int somaDigPrincipal = 0;
        int somaDigSecundaria = 0;
        boolean verificacao = true;
        int registrador = 0;
        int numeroProcurado;
        int r = 0;
        int[] somatoriaColuna = new int[n];
        int[] somatoriaLinha = new int[m];
        System.out.println("Insira os valores da matriz:");
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < n; c++) {
                matriz[l][c] = in.nextInt();
                somatoriaLinha[l] += matriz[l][c];
                if (matriz[l][c] % 2 == 0) somaPares += matriz[l][c];
                if (l % 2 == 1 && c % 2 == 1) somaImpares += matriz[l][c];
                if (matriz[l][c] % 2 == 1) produtoImpares *= matriz[l][c];
            }
        }
        System.out.println("Valor total da soma de todos os elementos pares da matriz: " + somaPares);
        System.out.println("Valor da soma dos elementos dos índices impares da matriz: " + somaImpares);
        System.out.println("Valor do produto dos elementos impares da matriz: " + produtoImpares);

        //Busca do número procurado:
        System.out.println("Qual numeros você deseja encontrar na matriz? ");
        numeroProcurado = in.nextInt();
        for (int l = 0; l < m; l++) {
            for (int c = 0; c < n; c++) {
                if (matriz[l][c] == numeroProcurado) {
                    System.out.println("O número procurado se encontra na linha "
                            + l + " e na coluna " + c);
                }
            }
        }

        // Soma diagonal principal
        if (m == n) {
            for (int i = 0; i < n; i++) {
                somaDigPrincipal += matriz[i][i];
            }
            System.out.println("Somatoria da diagonal principal da matriz: " + somaDigPrincipal);
            for (int i = n - 1; i >= 0; i--) {
                somaDigSecundaria += matriz[r][i];
                r++;
            }
            System.out.println("Somatoria da diagonal secundaria da matriz: " + somaDigSecundaria);
        }
        System.out.println("Vetor com a somatoria de todas as linhas da matriz:");
        for (int i = 0; i < n; i++)
            System.out.print(somatoriaLinha[i] + " - ");
        System.out.println();
        System.out.println("Vetor com a somatoria de todas as colunas da matriz:");
        for (int i = 0; i < m; i++) {
            for (int l = 0; l < n; l++)
                somatoriaColuna[i] += matriz[l][i];
            System.out.print(somatoriaColuna[i] + " - ");
        }
        System.out.println();
    }
}
