package TESTE_CIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge5 {
    public static void main(String[] args) {
        List<Boolean> assinante = new ArrayList<>();
        assinante.add(true);
        assinante.add(false);
        assinante.add(false);
        assinante.add(false);
        assinante.add(true);
        assinante.add(false);
        assinante.add(true);
        assinante.add(true);
        assinante.add(false);
        assinante.add(false);
        assinante.add(false);

        List<Integer> minutos = new ArrayList<>();
        minutos.add(6144);
        minutos.add(2742);
        minutos.add(330);
        minutos.add(30);
        minutos.add(1500);
        minutos.add(4032);
        minutos.add(24036);
        minutos.add(3288);
        minutos.add(2076);
        minutos.add(24540);
        minutos.add(4716);


        List<Integer> chances = calculaPorcentagemSorteio(assinante, minutos);
        System.out.println(chances);
    }

    public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinante, List<Integer> minutosAssistidos) {
        Integer[] contador = new Integer[minutosAssistidos.size()];
        Integer[] horasAssistidas = new Integer[minutosAssistidos.size()];
        List<Integer> porcents = new ArrayList<>();

        for (int i = 0; i < assinante.size(); i++) {
            if (assinante.get(i)) {
                double valorArmazenado = (double) minutosAssistidos.get(i) / 60;
                valorArmazenado = Math.ceil(valorArmazenado);
                horasAssistidas[i] = (int) valorArmazenado * 2;
            } else {
                double valorArmazenado = (double) minutosAssistidos.get(i) / 60;
                valorArmazenado = Math.ceil(valorArmazenado);
                horasAssistidas[i] = (int) valorArmazenado;
            }

        }
        Integer totalDeHoras = 0;
        for (int i = 0; i < minutosAssistidos.size(); i++) {
            totalDeHoras += horasAssistidas[i];
        }

        for (int i = 0; i < minutosAssistidos.size(); i++) {
            double operacao = (double) (horasAssistidas[i] * 100) / totalDeHoras;
            System.out.println(operacao);
            Integer operacaoInt = (int) operacao;

            System.out.println(operacaoInt);

            if (operacao - 0.5 > operacaoInt)
                operacao = Math.ceil(operacao);

            contador[i] = (int) operacao;
            porcents.add(contador[i]);
        }
        return porcents;
    }
}
