package ADO_arraylist;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos valores para o calculo da media voce deseja:");
        int tamanho = in.nextInt();
        double vetor[] = new double[tamanho];
        double somar = 0;
        double media;
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = in.nextDouble();
            somar += vetor[i];
        }
        media = somar/tamanho;
        System.out.println("A media aritmetica dos valores inseridos e igual a: " + media);
    }
}
