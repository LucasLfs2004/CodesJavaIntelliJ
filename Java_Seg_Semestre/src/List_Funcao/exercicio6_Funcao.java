package List_Funcao;

import java.util.Scanner;

public class exercicio6_Funcao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = gerarMatriz(in);
        System.out.println("Qual o número que deve ser procurado na matriz?");
        int numeroProcurado = in.nextInt();
        int repeticao = verificaRepeticao(matriz, numeroProcurado);
        if (repeticao == 0) System.out.println("Número não encontrado");
        else {
            int [][] tabela = exibirRepeticao(matriz, numeroProcurado, repeticao);
            System.out.println("Quantidades de vezes que o valor " + numeroProcurado + " foi repetido: " + repeticao);
            for (int l = 0; l < tabela.length; l++) {
                for (int c = 0; c < tabela[0].length; c++) {
                    System.out.print(tabela[l][c] + "  ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] gerarMatriz (Scanner in) {
        System.out.println("Insira a quantidade de linhas da matriz:");
        int n = in.nextInt();
        System.out.println("Insira a quantidade de colunas da matriz");
        int m = in.nextInt();
        int[][] matrizInt = new int[n][m];
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < m; c++) {
                System.out.println("Insira um valor para preencher a matriz:");
                matrizInt[l][c] = in.nextInt();
            }
        }
        return matrizInt;
    }

    public static int verificaRepeticao (int[][] matriz, int procurar) {
        int acumulador = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[l][c] == procurar) acumulador++;
            }
        }
        return acumulador;
    }

    public static int[][] exibirRepeticao (int[][] matrizVerificada, int procurar, int linhas) {
        int [][] matrizRepeticao = new int[linhas][2];
        int linha = 0;
        for (int l = 0; l < matrizVerificada.length; l++) {
            for (int c = 0; c < matrizVerificada[0].length; c++) {
                if (matrizVerificada[l][c] == procurar) {
                    int coluna = 0;
                    matrizRepeticao[linha][coluna] = l;
                    coluna++;
                    matrizRepeticao[linha][coluna] = c;
                    linha++;
                }
            }
        }
       return matrizRepeticao;
    }
}
