package ADO_arraylist;

public class exercicio12 {
    public static void main(String[] args) {
        int[] A = {1, 0, 5, -2, -5, 7};
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma dos vetores de posicao 0, 1 e 5: " + soma);

        A[4] = 100;

        for (int i = 0; i < 6; i++) {
            System.out.println(A[i]);
        }
    }
}
