package TESTE_CIT;

import java.text.DecimalFormat;

public class Challenge8 {
    public static void main(String[] args) {
        String tf1 = "0,00";
        String vqr1 = "1,70";
        String tf2 = "5,00";
        String vqr2 = "1,00";

        String resposta = escolheTaxi(tf1, vqr1, tf2, vqr2);
        System.out.println(resposta);
    }

    public static String escolheTaxi(String tf1, String vqr1, String tf2, String vqr2) {
        DecimalFormat df = new DecimalFormat("#.00");
        Double taxa1, taxa2, km1, km2, valorTotal1, valorTotal2;
        double distancia = 0;
        String resposta = "";
        Double[] valor1 = new Double[100];
        Double[] valor2 = new Double[100];


        tf1 = tf1.replaceAll(",", ".");
        taxa1 = Double.valueOf(tf1);
        System.out.println(taxa1);
        tf2 = tf2.replaceAll(",", ".");
        taxa2 = Double.valueOf(tf2);
        System.out.println(taxa2);
        vqr1 = vqr1.replaceAll(",", ".");
        km1 = Double.valueOf(vqr1);
        System.out.println(km1);
        vqr2 = vqr2.replaceAll(",", ".");
        km2 = Double.valueOf(vqr2);
        System.out.println(km2);

        boolean igual = false;
        double distanciaIgual = 0;
        double contador1 = 0;
        double contador2 = 0;
        int igualdade = 1;
        int valorMenor = 0;
        int valorMaior = 0;

        for (int i = 0; i < 100; i++) {
            valor1[i] = taxa1 + (km1 * distancia);
            valor2[i] = taxa2 + (km2 * distancia);
            distancia += 1;
        }

        for (int i = 0; i < 100; i++) {
            if (valor1[i] - valor2[i] == 0) {
                igual = true;
                distanciaIgual = i;
                igualdade = i;
            }
            if (valor1[i] < valor2[i]) {
                contador1++;
            } else if (valor1[i] > valor2[i]) {
                contador2++;
            }
        }

        distancia = Math.abs((taxa2 - taxa1) / (km2 - km1));
        String distanciaString = String.valueOf(distancia);
        if (distanciaString.length() > 4)
        distanciaString = distanciaString.substring(0, 4);

        if (valor1[igualdade - 1] < valor2[igualdade - 1]) {
            valorMenor = 1;
            valorMaior = 2;
        } else {
            valorMenor = 2;
            valorMaior = 1;
        }

        if (contador2 == contador1)
            resposta = "Tanto faz";
        else if (contador1 == 0 && contador2 > 0)
            resposta = "Empresa 2";
        else if (contador2 == 0 && contador1 > 0)
            resposta = "Empresa 1";
        else if (igual)
            resposta = "Empresa " + valorMenor + " quando a distância < " + distanciaIgual + ", Tanto faz quando a distância = "
                    + distanciaIgual + ", Empresa " + valorMaior + " quando a distância > " + distanciaIgual;
        else
            resposta = "Empresa " + valorMenor + " quando a distância < " + distanciaString + ", Tanto faz quando a distância = "
                    + distanciaString + ", Empresa " + valorMaior + " quando a distância > " + distanciaString;
        return resposta;
    }
}
