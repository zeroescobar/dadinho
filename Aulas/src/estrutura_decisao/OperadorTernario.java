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
public class OperadorTernario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        byte idade = input.nextByte();
        boolean maiorDeidade = idade >= 18 ? true : false;
        
        if (maiorDeidade){
            System.out.println("Voce é maior de idade");
        }else{
            System.out.println("Voce é menor de idade");
        }
    }
}
