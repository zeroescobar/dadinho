
package aulas;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o seu nome: ");
        String nome  = input.nextLine();
        
        System.out.println("Qual o seu peso: ");
        float peso = input.nextFloat();
        
        System.out.println("Qual a sua altura: ");
        float altura = input.nextFloat();
        
        float imc = (float) (peso / (altura * altura));
        
        System.out.printf("%s voce tem um imc de %.2f\n",nome,imc);
        
        
    }
}
