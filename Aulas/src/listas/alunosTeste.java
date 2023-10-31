/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author Aluno
 */
public class alunosTeste {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Santana", 4.5f, 3.2f, 2);
        Alunos aluno2 = new Alunos("Vitor", 2.3f, 7.9f, 4);
        Alunos aluno3 = new Alunos("Samanta", 9.5f, 5.7f, 3);
        Alunos aluno4 = new Alunos("Arthur", 2.4f, 5.6f, 1);
        Alunos aluno5 = new Alunos("Marcela", 4.3f, 7.6f, 2);
        Alunos[] alunoses = {aluno1,aluno2,aluno3,aluno4,aluno5};
        
        for(Alunos al :alunoses){
            System.out.println(al.toString());
        }
    }
}
