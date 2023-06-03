package ADO1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe seu orçamento:");
        double orcamento = in.nextDouble();
        System.out.println("Informe seus gastos:");
        double gastos = in.nextDouble();

        String economia = operacao(orcamento, gastos);
        System.out.println(economia);
    }

    public static String operacao(double orcamento, double gastos) {
        String mensagem;
        if (orcamento >= gastos) {
            mensagem = "Você está dentro do orçamento!";
        } else {
            mensagem = "Você está fora do orçamento! Não gaste mais!";
        }
        return mensagem;
    }
}
