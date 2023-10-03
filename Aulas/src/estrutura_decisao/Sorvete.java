package estrutura_decisao;

import java.util.Scanner;

public class Sorvete {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Esta sol: ");
        String estaSol = input.nextLine();
        System.out.println("Voce esta trabalhando: ");
        String estaTrabalhando = input.nextLine();
        
        if(estaSol.equalsIgnoreCase("sim") && estaTrabalhando.equalsIgnoreCase("sim")){
            System.out.println("Vou a sorveteria");
        }else{
            System.out.println("Nao vou a sorveteria");
        }
        
        input.close();
    }
}
