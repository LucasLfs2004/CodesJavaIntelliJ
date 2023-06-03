package ADO1;

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cor1 = in.next();
        String cor2 = in.next();

        String reproduzir = resultado(cor1, cor2);
        System.out.println(reproduzir);
    }
    public static String resultado (String cor1, String cor2) {
        String Resultado = null;
        cor1 = cor1.toLowerCase();
        cor2 = cor2.toLowerCase();
        if (cor1.equals("amarelo") || cor1.equals("vermelho") || cor1.equals("azul") &&
                cor2.equals("amarelo") || cor2.equals("vermelho") || cor2.equals("azul")) {

            switch (cor1) {
                case "amarelo":
                    if(cor2.equals("vermelho")) Resultado = "Laranja";
                    else if (cor2.equals("azul")) Resultado = "Verde";
                    break;
                case "azul":
                    if(cor2.equals("amarelo")) Resultado = "Verde";
                    else if (cor2.equals("vermelho")) Resultado = "Roxo";
                    break;
                case "vermelho":
                    if(cor2.equals("amarelo")) Resultado = "Laranja";
                    else if (cor2.equals("azul")) Resultado = "Roxo";
                    break;
            }
        }
        else {
            Resultado = "Apenas cores primárias são aceitas";
        }

        return Resultado;
    }
}
