/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objeto;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private int idade;
    private float nota;
    private float altura;
    private String email;

    public Aluno() {
        
    }

    public Aluno(String nome, int idade, float nota, float altura, String email) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.altura = altura;
        this.email = email;
    }

    public Aluno(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    
}
