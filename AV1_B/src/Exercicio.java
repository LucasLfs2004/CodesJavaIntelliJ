public class Exercicio {
    private String nome;
    private int repeticoes;

    public Exercicio(String nome, int repeticoes) {
        this.nome = nome;
        this.repeticoes = repeticoes;
    }

    public Exercicio() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
}
