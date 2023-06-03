package ADO1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int compra = in.nextInt();
        int parcelamento = in.nextInt();

        String mensagemDeCompra = situacaoDeCompra(compra, parcelamento);
        System.out.println(mensagemDeCompra);
    }

    public static String situacaoDeCompra (int compra, int parcelamento) {
        String mensagem;

        if (compra < 1 || parcelamento < 1){
            mensagem = "Compra inválida.";
        }
        else {
            mensagem = "Sua compra de R$ " + compra + " em " +
                    parcelamento + "x de R$ " + (compra/parcelamento) + " foi concluída";
        }
        return mensagem;
    }
}
