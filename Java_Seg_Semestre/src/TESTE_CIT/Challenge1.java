package TESTE_CIT;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        ArrayList<Integer> postosDeGasolina = new ArrayList<Integer>();
        postosDeGasolina.add(2);
        postosDeGasolina.add(15);
        postosDeGasolina.add(22);
        postosDeGasolina.add(11);
        Integer combustivel = 2;
        Integer consumo = 8;

        Integer resultado = ultimaParada(combustivel, consumo, postosDeGasolina);
        System.out.println(resultado);
    }


    public static Integer ultimaParada(Integer combustivel, Integer consumo, List<Integer> postosDeGasolina) {
        Integer distancia = 8 * 2;
        Integer posto = -1;
        for (int i = 0; i < postosDeGasolina.size(); i++) {
            if (distancia > postosDeGasolina.get(i)) {
                if (posto < postosDeGasolina.get(i))
                    posto = postosDeGasolina.get(i);
            }
        }
        return posto;
    }
}
