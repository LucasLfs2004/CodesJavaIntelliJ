package ADO1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String siglaDoCurso = in.next();
        boolean isencao = Boolean.parseBoolean(in.next());
        double desconto = in.nextInt();

        double preco = calculoDaMensalidade(siglaDoCurso, isencao, desconto);
        System.out.println(preco);
    }

    public static double calculoDaMensalidade(String siglaDoCurso,
                                              boolean isencao,
                                              double desconto) {
        double mensalidade = 0;
        siglaDoCurso = siglaDoCurso.toUpperCase();
        if (isencao) {
            mensalidade = 0;
        } else {
            switch (siglaDoCurso) {
                case "SI":
                    mensalidade = 550 - 550 * (desconto / 100);
                    break;
                case "ADS":
                    mensalidade = 750 - 750 * (desconto / 100);
                    break;
                case "CS":
                    mensalidade = 1150 - 1150 * (desconto / 100);
                    break;
                case "EC":
                    mensalidade = 1300 - 1300 * (desconto / 100);
                    break;
                case "ES":
                    mensalidade = 950 - 950 * (desconto / 100);
                    break;
            }
        }
        return mensalidade;
    }
}
