/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_repeticao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NumerosFor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero menor que 1000");
        short numero = input.nextShort();
        if(numero<100){
        for(int i=0;i<numero;i++){
            System.out.println("Numero"+ i);
        }
        }else{
            System.out.println("Numero invalido");
        }
        
        input.close();
    }
}
