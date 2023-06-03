package TESTE_CIT;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        List<List<Integer>> Tickets = new ArrayList<>();
        ArrayList<Integer> vendas1 = new ArrayList<>();
        ArrayList<Integer> vendas2 = new ArrayList<>();
        vendas1.add(200);
        vendas1.add(100);
        vendas2.add(300);
        Tickets.add(vendas1);
        Tickets.add(vendas2);
        System.out.println(Tickets);
        List<Integer> retorno = retornaMenorEMaiorValorDeVendas(Tickets);
        System.out.println(retorno);
    }
    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
        ArrayList<Integer> resultado = new ArrayList<>();
        ArrayList<Integer> receber = new ArrayList<>();

        for (int i = 0; i < tickets.size(); i++) {
            for (int l = 0; l < tickets.get(i).size(); l++) {
                receber.add(tickets.get(i).get(l));
            }
        }
        Integer menorNumero = receber.get(0);
        for (int i = 0; i< receber.size(); i++) {
            if (menorNumero > receber.get(i) && receber.get(i) != 0) menorNumero = receber.get(i);
        }
        Integer maiorNumero = receber.get(0);
        for (int i = 0; i< receber.size(); i++) {
            if (maiorNumero < receber.get(i)) maiorNumero = receber.get(i);
        }

        resultado.add(menorNumero);
        resultado.add(maiorNumero);

        return resultado;

    }
}
