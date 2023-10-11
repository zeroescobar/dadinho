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
public class NumerosFor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero <1000: ");
        int n = input.nextInt();
        if(n<=1000){
            for(int i = n;i>-1;i--){
                System.out.println("n "+i);
            }
        }
        else{
            System.out.println("Numero>1000");
        }

        
    }
}
