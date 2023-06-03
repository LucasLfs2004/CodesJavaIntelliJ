package ADO1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual a cor do farol?");
        String cor = in.next();

        String situacao = ordem(cor);
        System.out.println(situacao);
    }

    public static String ordem(String cor) {
        String decisao;
        cor = cor.toLowerCase();
        if (cor.equals("vermelho")) {
            decisao = "Espere";
        } else if (cor.equals("verde")) {
            decisao = "Atravesse";
        } else {
            decisao = "Farol inoperante";
        }
        return decisao;
    }
}
