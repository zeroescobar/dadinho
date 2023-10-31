/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author Aluno
 */
public class Alunos {
    private String nome;
    private float nota1;
    private float nota2;
    private int faltas;
    private float media;
    private AprovacaoEnum situacao;

    public Alunos(String nome, float nota1, float nota2, int faltas) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
        this.situacao = calcularMedia();
        
    }
    public AprovacaoEnum calcularMedia(){
        this.media = (this.nota1 + this.nota2) / 2;
        if (this.media > 7 && this.faltas <=2){
            return AprovacaoEnum.APROVADO;
        }else if(this.media >= 5 && this.media <= 7 && this.faltas <=3 ){
            return AprovacaoEnum.RECUPERACAO;
           
        }else{
            return AprovacaoEnum.REPROVADO;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public AprovacaoEnum getSituacao() {
        return situacao;
    }

    @Override
    public String toString() {
        return "Alunos{" + "nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", faltas=" + faltas + ", media=" + media + ", situacao=" + situacao + '}';
    }
    
}
