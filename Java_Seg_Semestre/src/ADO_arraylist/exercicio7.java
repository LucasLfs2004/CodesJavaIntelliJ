package ADO_arraylist;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] salario = new double[10];
        double salarioMaior = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "o salário:");
            salario[i] = in.nextDouble();
            if (salarioMaior < salario[i]) salarioMaior = salario[i];
        }
        System.out.println("O maior salário é: " + salarioMaior);
    }
}
