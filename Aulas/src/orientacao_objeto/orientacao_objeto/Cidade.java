package orientacao_objeto;

public class Cidade {
    private int numeroBairros;
    private int numeroRuas;
    private String nome;
    private int idade;
    private int numeroHabitantes;

    public Cidade() {
    }

    public int getNumeroBairros() {
        return numeroBairros;
    }

    public void setNumeroBairros(int numeroBairros) {
        this.numeroBairros = numeroBairros;
    }

    public int getNumeroRuas() {
        return numeroRuas;
    }

    public void setNumeroRuas(int numeroRuas) {
        this.numeroRuas = numeroRuas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public Cidade(int numeroBairros, int numeroRuas, String nome, int idade, int numeroHabitantes) {
        this.numeroBairros = numeroBairros;
        this.numeroRuas = numeroRuas;
        this.nome = nome;
        this.idade = idade;
        this.numeroHabitantes = numeroHabitantes;
    }
    
}
