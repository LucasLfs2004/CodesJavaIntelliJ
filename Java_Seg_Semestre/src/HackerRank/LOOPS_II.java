package HackerRank;

import java.util.Scanner;

public class LOOPS_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int resultados = a;
            resolucao(a, b, n, resultados);
        }
    }

    public static void resolucao (int a, int b, int n, int resultados) {
        for (int r = 0; r < n; r++) {

            resultados += (int) (Math.pow(2, r) * b);
            System.out.print(resultados + " ");
        }
        System.out.println();
    }
}
