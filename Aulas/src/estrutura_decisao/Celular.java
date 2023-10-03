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
public class Celular {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float orcamento = 1750.00f;
        float desconto = 0f;
        System.out.println("Valor telefone: ");
        float valorTelefone = input.nextFloat();
        
        System.out.println("Forma de pagamento: 1 para a vista ou 2 para prazo");
        char formaDePagamento = input.next().charAt(0);
        
        if (formaDePagamento == '1'){
            System.out.println("A vista...");
            desconto = valorTelefone * 0.1f;
        }else{
            System.out.println("A prazo...");
        }
        float valorFinal = valorTelefone - desconto;
        if(valorFinal <= orcamento){
            System.out.println("Comprei celular\nvalor: R$"+valorFinal);
        }else{
            System.out.println("Nao comprei celular\nvalor: R$"+valorFinal);
        }
        
        
        
    }
}
