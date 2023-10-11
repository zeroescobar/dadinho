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
public class NumerosParesForBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte cont = 0;
        for(int i = 0;i<100;i++){
             if(i%2==0){
                 System.out.println("Numero "+i);
                 cont++;
             }
             if(cont>=30){
                 break;
             }
        }
    }
}
