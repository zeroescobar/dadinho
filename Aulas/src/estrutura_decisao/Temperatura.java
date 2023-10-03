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
public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Temp: ");
        byte temp = input.nextByte();
        
        if(temp <=10){
            System.out.println("frio");
        }else if(temp > 10 && temp <=17){
            System.out.println("agradavel");
        }else if(temp > 17 && temp <=27){
            System.out.println("calor");
        }else if(temp > 27 && temp <=37){
            System.out.println("muito calor");
        }else{
            System.out.println("fritando ovos no chao");
        }
        
        input.close();
        
    }
}
