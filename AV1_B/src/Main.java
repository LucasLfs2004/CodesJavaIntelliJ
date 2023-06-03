import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Treino treino = new Treino();
        boolean active = true;

        while (active) {
            System.out.println("O que deseja fazer?");
            System.out.println("1. Adicionar exercício");
            System.out.println("2. Próximo exercício");
            System.out.println("3. Exibir exercícios");
            System.out.println("0. Sair");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Informe o exercício:");
                    String nome = in.next();
                    System.out.print("QTD. de repetições:");
                    int qtd = in.nextInt();
                    Exercicio exercicio = new Exercicio(nome, qtd);
                    treino.adicionar(exercicio);
                    break;
                case 2:
                    Exercicio retorno = treino.proximo();
                    System.out.println(retorno.getNome() + " em " + retorno.getRepeticoes() + " repetições");
                    break;
                case 3:
                    treino.exibir();
                    break;
                case 0:
                    active = false;
                    break;
            }
        }

    }
}