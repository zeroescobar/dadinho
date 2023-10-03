
package estrutura_decisao;

import java.util.Scanner;

public class Curso {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nota: ");
        float nota = input.nextFloat();
        
        System.out.println("Faltas: ");
        int faltas = input.nextInt();
        
        if(nota>=5 && faltas <=3){
            System.out.println("Aprovado");
        }else if(faltas>3){
            System.out.println("Reprovado");
        }else{
            System.out.println("Recuperacao");
        }
    }
}
