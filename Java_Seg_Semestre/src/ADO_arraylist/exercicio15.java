package ADO_arraylist;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] salario = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "o salário:");
            salario[i] = in.nextDouble();
            if (salario[i] < 1000) salario[i] += salario[i]/10;
        }
        System.out.println("Lista atualizada: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "o salario: R$" + salario[i]);
        }
    }
}
