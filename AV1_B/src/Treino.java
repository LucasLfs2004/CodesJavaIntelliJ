public class Treino {
    private int tamanho = 5;
    Exercicio [] exercicios = new Exercicio[tamanho];
    int index = -1;

    public void adicionar(Exercicio exercicio) {
        exercicios[++index] = exercicio;
    }

    public Exercicio proximo() {
        Exercicio retorno = exercicios[0];
        for (int i = 0; i <= index - 1; i++) {
            exercicios[i] = exercicios[i+1];
        }
        exercicios[index] = new Exercicio();
        return retorno;
    }

    public void exibir() {
        for (int i = 0; i <= index; i++) {
            System.out.println(exercicios[i].getNome());
        }
    }
}
