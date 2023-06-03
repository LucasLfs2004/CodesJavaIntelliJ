package ADO1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o número do dia da semana?");
        int numero = in.nextInt();
        String mensagem = diaDaSemana(numero);
        System.out.println(mensagem);

    }

    public static String diaDaSemana (int numero) {
        String dia;
        String diasDaSemana[] = {"Domingo", "Segunda-feira", "Terça-feira",
                "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        if (numero <= 6 && numero >= 0) {
            dia = diasDaSemana[numero];
        }
        else {
            dia = "Dia da semana inválido";
        }
        return dia;
    }
}
