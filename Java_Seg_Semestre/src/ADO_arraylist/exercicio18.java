package ADO_arraylist;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos alunos a sala tem?");
        int tamanho = in.nextInt();
        String[] nome = new String[tamanho];
        double[] prova1 = new double[tamanho];
        double[] prova2 = new double[tamanho];
        double[] media = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira o nome do " + (i + 1) + "o aluno:");
            nome[i] = in.next();
            System.out.println("Insira a nota da prova 1 do aluno " + nome[i] + ":");
            prova1[i] = in.nextInt();
            System.out.println("Insira a nota da prova 2 do aluno " + nome[i] + ":");
            prova2[i] = in.nextInt();
            media[i] = (prova1[i] + prova2[i]) / 2;
        }

        for (int i = 0; i< tamanho;i++) {
            System.out.println("# Aluno " + (i + 1) + " #");
            System.out.println("Nome do aluno: " + nome[i]);
            System.out.println("Nota da prova 1: " + prova1[i]);
            System.out.println("Nota da prova 2: " + prova2[i]);
            System.out.println("Media das 2 provas: " + media[i]);
        }
    }
}
