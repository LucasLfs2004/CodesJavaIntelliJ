package ADO1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o peso do sorvete(em gramas):");
        int peso = in.nextInt();

        double preco = precoAPagar(peso);
        System.out.format("O valor a se pagar é igual a: %.2f", preco);

    }

    public static double precoAPagar (int peso) {
        double valor;
        if (peso < 1000) {
            valor = (peso * 3.50)/100;
        }
        else {
            valor = (peso * 3)/100;
        }
        return valor;
    }
}
