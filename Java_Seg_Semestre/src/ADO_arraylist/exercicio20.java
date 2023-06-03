package ADO_arraylist;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] x = new int[5];
        int[] y = new int[5];
        int somaX = 0;
        int diferenca = 0;
        int numerosSomenteY = 0;
        int[] intersecao = new int[5];
        int[] uniaoXY = new int[10];
        System.out.println("Vetor X");
        for (int i = 0; i < 5; i++) {
            x[i] = in.nextInt();
            somaX += x[i];
            uniaoXY[i] = x[i];
        }
        System.out.println("Vetor Y");
        for (int i = 0; i < 5; i++) {
            y[i] = in.nextInt();

            int r = 0;
            boolean verifica = true;
            while (verifica && r < 5) {
                if (y[i] == x[r]) {
                    intersecao[i] = y[i];
                    verifica = false;
                } else r++;
            }
            if (verifica) {
                uniaoXY[(i + 5)] = y[i];
                numerosSomenteY += y[i];
            }
            diferenca = somaX - numerosSomenteY;
        }

        System.out.println("Soma dos elementos de cada vetor, nas respectivas posicoes");
        for (int i = 0; i < 5; i++) System.out.println(x[i] + y[i]);
        System.out.println("Produto dos elementos de cada vetor, nas respectivas posicoes");
        for (int i = 0; i < 5; i++) System.out.println(x[i] * y[i]);
        System.out.println("Diferenca de x e y:");
        System.out.println(diferenca);
        System.out.println("Intersecao de x e Y:");
        for (int i = 0; i < 5; i++) System.out.println(intersecao[i]);
        System.out.println("Uniao de x e y:");
        for (int i = 0; i < 10; i++) System.out.println(uniaoXY[i]);
    }
}
