package TESTE_CIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        List<String> senha = new ArrayList<>();
        senha.add("0110100000");
        senha.add("1001011111");
        senha.add("1110001010");
        senha.add("0111010101");
        senha.add("0011100110");
        senha.add("1010011001");
        senha.add("1101100100");
        senha.add("1011010100");
        senha.add("1001100111");
        senha.add("1000011000");
        Integer senhaPronta = calculaNumeroDaSenha(senha);
        System.out.println("Senha em decimal: " + senhaPronta);
    }

    public static Integer calculaNumeroDaSenha(List<String> senha) {
        Integer senhaPronta = 0;
        String gerandoSenha = "";
        int potenciacao = 9;
        ArrayList<String> senhaSeparada = new ArrayList<>();
        for (int i = 0; i < senha.size(); i++) {
            senhaSeparada.clear();
            int acumulador = 0;
            System.out.println("senha nº " + (i + 1));
            for (int l = 0; l < 10; l++) {
                senhaSeparada.add(String.valueOf(senha.get(l).charAt(i)));
            }
            System.out.println("Senha Separada: " + senhaSeparada);
            for (int r = 0; r < senhaSeparada.size(); r++) {
                if (senhaSeparada.get(r).equals("1")) acumulador++;
                System.out.println("Numero Selecionado: " + senhaSeparada.get(i) + " || Acumulador: " + acumulador);
            }
            if (acumulador >= 5) {
                System.out.println("Adicionando 1");
                gerandoSenha = gerandoSenha.concat("1");
                senhaPronta += (int) Math.pow(2, potenciacao);
            }
            else {
                System.out.println("Adicionando 0");
                gerandoSenha = gerandoSenha.concat("0");
            }
            potenciacao--;
        }
        System.out.println(gerandoSenha);
        return senhaPronta;
    }
}
