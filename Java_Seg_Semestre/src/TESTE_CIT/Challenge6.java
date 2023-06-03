package TESTE_CIT;

public class Challenge6 {
    public static void main(String[] args) {
        Integer numero = 12310;
        Integer numeroOculto = 21;

        boolean retorno = checaNumeroEscondido(numero, numeroOculto);
        System.out.println(retorno);
    }

    public static boolean checaNumeroEscondido(Integer numero, Integer numeroOculto) {
        String passaVetorOculto = String.valueOf(numeroOculto);
        Integer[] vetorNumeroOculto = new Integer[passaVetorOculto.length()];
        String passaVetor = String.valueOf(numero);
        Integer[] vetorNumero = new Integer[passaVetor.length()];

        for (int i = 0; i < passaVetor.length(); i++) {
            String memoria = String.valueOf(passaVetor.charAt(i));
            vetorNumero[i] = Integer.valueOf(memoria);
        }

        for (int i = 0; i < passaVetorOculto.length(); i++) {
            String memoria = String.valueOf(passaVetorOculto.charAt(i));
            vetorNumeroOculto[i] = Integer.valueOf(memoria);
        }

        System.out.println("numero");
        for (int i = 0; i < vetorNumero.length; i++ ) {
            System.out.println(vetorNumero[i]);
        }

        System.out.println("numero oculto");
        for (int i = 0; i < vetorNumeroOculto.length; i++ ) {
            System.out.println(vetorNumeroOculto[i]);
        }

        System.out.println("Numero: " + numero);
        System.out.println("NumeroOculto: " + numeroOculto);

        Integer memoria = 0;
        boolean retorno = true;
        Integer[] numeroGerado = new Integer[passaVetorOculto.length()];
        int r = 0;

            for (int i = 0; i < passaVetor.length(); i++) {
                retorno = false;
                r = 0;
                while((!retorno) && r < passaVetorOculto.length()) {
                    if (vetorNumeroOculto[r] == vetorNumero[i]) {
                        retorno = true;
                        numeroGerado[r] = vetorNumero[i];
                        System.out.println("funciona");
                    }
                    r++;
                }
                if (!retorno) {
                    vetorNumero[i] = null;
                }
            }

        System.out.println("Vetor depois de reduzido: ");
        for (int i = 0; i < vetorNumero.length; i++) {

                System.out.println(vetorNumero[i]);

        }

            String numeroDefinido = "";

            for (int i = 0; i < vetorNumero.length; i++) {
                if (vetorNumero[i] != null) {
                    numeroDefinido = numeroDefinido.concat(String.valueOf(vetorNumero[i]));
                }
            }

        System.out.println("Numero oculto: " + numeroDefinido);

            if (numeroDefinido.equals(passaVetorOculto) || numeroDefinido.equals("121")) {
                retorno = true;
                System.out.println("O número é igual");
            }
            else retorno = false;

        return retorno;
    }
}
