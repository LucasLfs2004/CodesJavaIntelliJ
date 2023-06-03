//Nome do Projeto
public class Leao {

    //Variáveis da classe
    private static String nome = "Leao";

    //Atributos
    private int Idade;
    private String Especie;
    private String Origem;
    private int VelocidadeAtual;

    //Métodos assesores get and set
    //Definir cor do animal
    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    //Retornar cor do animal
    public String getOrigem() {
        return Origem;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    //Retornar cor do animal
    public int getIdade() {
        return Idade;
    }

    //Definir especie do animal
    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    //Retornar especie do animal
    public String getEspecie() {
        return Especie;
    }

    //Construtor vazio (sem parametro)
    public Leao() {
        this.Idade = 14;
    }

    //Construtor com parametro
    public Leao(String nomeOrigem) {
        this.Origem = nomeOrigem;
    }

    //Métodos
    //voar com uma velocidade constante
    public void correr(int numVelocidade) {
        this.VelocidadeAtual = numVelocidade;
    }

    //pousar a uma velocidade constante
    public void descansar(int numVelocidade) {
        this.VelocidadeAtual -= numVelocidade;
    }

    //instancie dois objetos da sua classe e exiba o nome dos animais criados


    public static void main(String[] args) {
        Leao felino = new Leao();
        felino.setIdade(14);
        felino.setEspecie("Leao-africano");
        felino.setOrigem("Africa");

        System.out.println("Idade: " + felino.getIdade());
        System.out.println("Especie: " + felino.getEspecie());
        System.out.println("origem: " + felino.getOrigem());
    }
}
