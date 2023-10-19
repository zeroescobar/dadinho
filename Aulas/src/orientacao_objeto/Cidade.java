package orientacao_objeto;

public class Cidade {
    private int idade;
    private int numeroRuas;
    private int numeroBairros;
    private int numeroHabitantes;
    private String nome;

    public Cidade() {
    }

    public Cidade(int idade, int numeroRuas, int numeroBairros, int numeroHabitantes, String nome) {
        this.idade = idade;
        this.numeroRuas = numeroRuas;
        this.numeroBairros = numeroBairros;
        this.numeroHabitantes = numeroHabitantes;
        this.nome = nome;
    }
    
}
