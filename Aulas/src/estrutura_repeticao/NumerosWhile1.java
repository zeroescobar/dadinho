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
public class NumerosWhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero menr que 1000");
        short numero = input.nextShort();
        
        byte contador = 0;
        while(contador < numero){
            System.out.println("Numero "+ contador);
            contador++;
        }
        
    }
}
