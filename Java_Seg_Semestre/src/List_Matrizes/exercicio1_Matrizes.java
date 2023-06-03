package List_Matrizes;

public class exercicio1_Matrizes {
    public static void main(String[] args) {
        int [][] matriz = new int[5][2];

        int registrador = 1;
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 5; c++) {
                matriz[c][l] = registrador;
                registrador++;
            }
        }
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[c][l] + "  ");
            }
            System.out.println();
        }

    }
}
