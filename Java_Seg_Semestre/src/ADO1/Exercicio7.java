package ADO1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valorconvertido;
        double reais = in.nextDouble();
        if(reais >= 0) {
            valorconvertido = conversao(reais);
            System.out.println(valorconvertido);
        }
        else {
            System.out.println("Valor inválido");
        }

    }

    public static double conversao (double reais) {
        double dolar = reais * 5.17;
        return dolar;
    }
}
