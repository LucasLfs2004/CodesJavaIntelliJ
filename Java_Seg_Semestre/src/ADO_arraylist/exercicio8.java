package ADO_arraylist;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamanho = 6;
        int[] pares = new int[tamanho];
        int[] paresInvertido = new int[tamanho];
        int i = 0;
        while (i < 6) {
            System.out.print("Insira um valor par: ");
            int recebe = in.nextInt();
            if (recebe % 2 == 0) {
                pares[i] = recebe;
                i++;
            }
        }
        System.out.println("## Números inseridos na ordem inversa ##");
        for (int r = 5; 0 <= r; r--) {
            System.out.println(pares[r]);
        }
    }
}
