/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objeto;

/**
 *
 * @author Aluno
 */
public class Cidade {
    private String nome;
    private int numeroBairros;
    private int numeroRuas;
    private int numeroHabitantes;
    private int idade;

    public Cidade() {
    }

    public Cidade(String nome, int numeroBairros, int numeroRuas, int numeroHabitantes, int idade) {
        this.nome = nome;
        this.numeroBairros = numeroBairros;
        this.numeroRuas = numeroRuas;
        this.numeroHabitantes = numeroHabitantes;
        this.idade = idade;
    }
}
