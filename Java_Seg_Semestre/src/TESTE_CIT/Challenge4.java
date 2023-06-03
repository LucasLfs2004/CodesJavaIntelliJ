package TESTE_CIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge4 {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";

        Integer k = 3;

        List<String> busca = new ArrayList<>();
        busca.add("a");
        busca.add("em");
        busca.add("i");
        busca.add("el");

        List<String> maisRepetidos = calculaTopOcorrenciasDeQueries(texto, busca, k);
        System.out.println(maisRepetidos);
    }

    public static List<String> calculaTopOcorrenciasDeQueries(String texto, List<String> queries, Integer k) {
        List<String> retorno = new ArrayList<>();
        List<Integer> buscaResultado = new ArrayList<>();
        texto = texto.replaceAll(",", "").toLowerCase();
        String textoSeparado[] = texto.split("");
        String textoBuscado = "";
        int[] acumulador = new int[queries.size()];
        System.out.println(queries.size());
        for (int r = 0; r < queries.size(); r++) {

            for (int i = 0; i < texto.length(); i++) {
                textoBuscado = "";
                for (int l = 0; l < queries.get(r).length(); l++) {


                    if (texto.length() - 1 != i)
                        textoBuscado += textoSeparado[i + l];
                    else {
                        textoBuscado = "";
                        textoBuscado += textoSeparado[i];
                    }

                }
                System.out.println(textoBuscado);

                if (textoBuscado.equals(queries.get(r))) {
                    acumulador[r]++;
                }
            }
            buscaResultado.add(acumulador[r]);
            System.out.println(buscaResultado);

        }

        String[] posicao = new String[k];
        Integer[] maior = new Integer[k];
        Integer location = 0;


        for (int l = 0; l < posicao.length; l++) {
            location = 0;
            if (l == 0) {
                for (int q = 0; q < buscaResultado.size(); q++) {
                    if (buscaResultado.get(q) > location) {
                        location = buscaResultado.get(q);
                        maior[l] = q;
                    }
                }
            }
            if (l == 1) {
                for (int q = 0; q < buscaResultado.size(); q++) {
                    if (buscaResultado.get(q) > location && q != maior[l-1]) {
                        location = buscaResultado.get(q);
                        maior[l] = q;
                    }
                }
            }
            if (l == 2) {
                for (int q = 0; q < buscaResultado.size(); q++) {
                    if (buscaResultado.get(q) > location && q != maior[l-1] && q != maior[l-2]) {
                        location = buscaResultado.get(q);
                        maior[l] = q;
                    }
                }
            }
            posicao[l] = queries.get(maior[l]);
            retorno.add(posicao[l]);
        }
        return retorno;

    }
}
