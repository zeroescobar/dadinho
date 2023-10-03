package estrutura_decisao;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        byte idade = input.nextByte();
        if(idade>= 18){
            System.out.println("Voce e maior de idade");
        }
        else{
            System.out.println("Voce e menor de idade");
        }
    }
}
