package List_Funcao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5_Funcao {
    static Scanner in = new Scanner(System.in);
    static String carater = null;
    static int linha;
    static int coluna;
    static int[][] matrizInt;
    static double[][] matrizDouble = new double[linha][coluna];
    static char[][] matrizChar = new char[linha][coluna];
    static String[][] matrizString = new String[linha][coluna];

    public static void main(String[] args) {
        informacoes();
        construir();
    }

    public static void informacoes() {
        System.out.println("Qual o caráter da matriz a ser constuida?");
        carater = in.next();
        System.out.println("Insira a quantidade de colunas da matriz:");
        coluna = in.nextInt();
        System.out.println("Insira a quantidade de linhas da matriz:");
        linha = in.nextInt();
    }

    public static void construir() {
        switch (carater.toLowerCase()) {
            case "int":
                matrizInt = new int[linha][coluna];
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) matrizInt[l][c] = in.nextInt();
                }
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) System.out.print(matrizInt[l][c] + "  ");
                    System.out.println();
                }
                break;
            case "double":
                matrizDouble = new double[linha][coluna];
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) matrizDouble[l][c] = in.nextDouble();
                }
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) System.out.print(matrizDouble[l][c] + "  ");
                    System.out.println();
                }
                break;
            case "char":
                matrizChar = new char[linha][coluna];
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) matrizChar[l][c] = in.next().charAt(0);
                }
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) System.out.print(matrizChar[l][c] + "  ");
                    System.out.println();
                }
                break;
            case "string":
                matrizString = new String[linha][coluna];
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) matrizString[l][c] = in.next();
                }
                for (int l = 0; l < linha; l++) {
                    for (int c = 0; c < coluna; c++) System.out.print(matrizString[l][c] + "  ");
                    System.out.println();
                }
                break;
            default:
                informacoes();
        }
    }
}
