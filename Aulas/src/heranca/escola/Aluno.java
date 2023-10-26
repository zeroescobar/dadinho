/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa{
    private String ra;
    private boolean matriculado;

    public Aluno(String ra, boolean matriculado, String nome, int idade, String email) {
        super(nome, idade, email);
        this.ra = ra;
        this.matriculado = matriculado;
    }
    
    

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
}
