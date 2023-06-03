import java.util.Scanner;

import java.util.Scanner;

public class sla {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("## Forma Geométrica: Triângulo");
            System.out.println("Insira o comprimento da linha:");
            int linhas = in.nextInt();

            desenharTriangulo(linhas);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            System.out.println(e.getMessage());
        }
    }

    public static void desenharTriangulo (int altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("Largura ou altura do retângulo inválidos");
        }

        for (int i = 1; i <= altura; i++) {
            for (int q = 1; q <= altura - i; q++) {
                System.out.print("  ");
            }
            for (int r = 1; r <= i; r++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

