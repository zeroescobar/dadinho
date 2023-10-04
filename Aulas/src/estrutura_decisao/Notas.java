/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_decisao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a media do aluno");
        byte media = input.nextByte();
        
        System.out.println("Digite as faltas do aluno: ");
        byte faltas = input.nextByte();
        
        boolean estaAprovado = media >= 5 && faltas <=3 ? true:false;
        
        if(estaAprovado){
            System.out.println("Voce esta aprovado");
        }else{
            System.out.println("Voce esta reprovado");
        }
    }
}
