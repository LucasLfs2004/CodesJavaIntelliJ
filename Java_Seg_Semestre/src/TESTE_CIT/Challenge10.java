package TESTE_CIT;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge10 {
    public static void main(String[] args) {
        List<Integer> musicasTocadas = Arrays.asList(10);

        List<Integer> resultado = shuffleMusicas(musicasTocadas);
        System.out.println(resultado);
    }

    public static List<Integer> shuffleMusicas(List<Integer> musicasTocadas) {
        Integer[] vetorOrdenado = new Integer[musicasTocadas.size()];
        Integer[] vetorInvertido = new Integer[musicasTocadas.size()];
        List<Integer> musicasOrdenadas = new ArrayList<>();
        int[] memoria = new int[musicasTocadas.size()];
        boolean verificacao = false;

        for (int i = 0; i < vetorOrdenado.length; i++) {
            vetorOrdenado[i] = musicasTocadas.get(i);
        }

        //Ordenção
        int aux = 0;
        for (int i = 0; i < vetorOrdenado.length - 1; i++) {
            for (int j = 0; j < vetorOrdenado.length - i - 1; j++) {
                if (vetorOrdenado[j] > vetorOrdenado[j + 1]) {
                    aux = vetorOrdenado[j];
                    vetorOrdenado[j] = vetorOrdenado[j + 1];
                    vetorOrdenado[j + 1] = aux;
                }
            }
        }

        for (int r = 0; r < vetorInvertido.length; r++) {
            vetorInvertido[r] = vetorOrdenado[vetorInvertido.length - 1 - r];
        }

        for (int r = 0; r < vetorOrdenado.length / 2; r++) {
            musicasOrdenadas.add(vetorInvertido[r]);

            musicasOrdenadas.add(vetorOrdenado[r]);

        }
        if (vetorOrdenado.length % 2 == 1 && vetorOrdenado.length != 1)
            musicasOrdenadas.add(vetorInvertido[vetorInvertido[(vetorOrdenado.length / 2) + 1]]);
        else if (vetorOrdenado.length == 1)
            musicasOrdenadas.add(vetorInvertido[0]);

        return musicasOrdenadas;
    }
}




