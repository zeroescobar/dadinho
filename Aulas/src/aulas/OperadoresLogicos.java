/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

/**
 *
 * @author Aluno
 */
public class OperadoresLogicos {
    public static void main(String[] args){
        
        //AND
        boolean hojeEDomingo = false;
        boolean hojeEstaSol = true;
        
        boolean vouJogarFutebol = hojeEDomingo && hojeEstaSol;
        System.out.println("Vou jogar futebol: "+ vouJogarFutebol);
        
        //OR
        boolean segundaFeira = true;
        boolean tercaFeira = true;
        boolean quartaFeira = false;
        boolean eFeriado = false;
        
        boolean vouParaAulaJava = segundaFeira || tercaFeira || quartaFeira || eFeriado;
        System.out.println("Vou para aula de java"+vouParaAulaJava);
        
        //NOT
        boolean estouEmCasa = false;
        boolean estouNoSenai = !estouEmCasa;
        
        System.out.println("Estou no senai"+estouNoSenai);
    }
}
