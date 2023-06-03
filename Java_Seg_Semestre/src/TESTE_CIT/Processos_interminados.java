package TESTE_CIT;

public class Processos_interminados {
    public static boolean checaNumeroEscondido(Integer numero, Integer numeroOculto) {
        String passaVetorOculto = String.valueOf(numeroOculto);
        Integer[] vetorNumero = new Integer[20];
        Integer[] vetorNumeroOculto = new Integer[20];
        for (int i = 0; i < passaVetorOculto.length(); i++) {
            String memoria = String.valueOf(passaVetorOculto.charAt(i));
            vetorNumeroOculto[i] = Integer.valueOf(memoria);
        }


        String passaVetor = String.valueOf(numero);
        for (int i = 0; i < passaVetor.length(); i++) {
            String memoria = String.valueOf(passaVetor.charAt(i));
            vetorNumero[i] = Integer.valueOf(memoria);
        }
        Integer memoria = 0;
        boolean retorno = true;
        int r = 0;
        Integer[] numeroGerado = new Integer[passaVetorOculto.length()];

        while (retorno && r < passaVetor.length()) {
            retorno = false;
            for (int i = 0; i < passaVetor.length(); i++) {
                if (vetorNumeroOculto[i] == vetorNumero[i]) {
                    retorno = true;

                }
            }
            r++;
        }
        return retorno;
    }
}

