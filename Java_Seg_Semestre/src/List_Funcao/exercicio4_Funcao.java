package List_Funcao;

import java.util.Scanner;

public class exercicio4_Funcao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int somatoria = vetor(x, in);
        System.out.println("A somatoria de numeros pares no vetor é igual a " + somatoria);
    }

    public static int vetor(int x, Scanner in) {
        int[] vetor = new int[x];
        for (int i = 0; i < x; i++) {
            vetor[i] = in.nextInt();
        }
        int resultado = 0;
        for (int i = 0; i < x; i++) {
            if (vetor[i] % 2 == 0) resultado += vetor[i];
        }
        return resultado;
    }
}