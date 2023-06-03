package TESTE_CIT;

public class Challenge7 {
    public static void main(String[] args) {
        Integer largura = 2;
        Integer altura = 4;

        Integer resultado = calculaTotalLeds(altura, largura);
        System.out.println(resultado);
    }
    public static Integer calculaTotalLeds(Integer altura,Integer largura) {
        Integer resultado;
        System.out.println(altura);
        System.out.println(largura);

        if (altura != 0 && largura != 0 ) resultado = (altura + 1) * (largura +1);
        else resultado = 0;

        return resultado;
    }
}

