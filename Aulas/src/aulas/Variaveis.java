/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

/**
 *
 * @author Aluno
 */
public class Variaveis {
    public static void main(String[] args){
        String nome = "Batata frita";
        int idade = 33;
        float peso = 0.33f;
        double altura = 0.23;
        char sexo = 'L';
        boolean cursando = true;
        System.out.println("Nome: "+ nome);
        System.out.println("numero: " + idade);
        System.out.println("trabalhando: " + cursando);
        System.out.println("altura: "+ altura);
        System.out.println("peso: "+ peso);
        System.out.println("sexo: "+ sexo);
        System.out.printf(nome, args);
    }
}
