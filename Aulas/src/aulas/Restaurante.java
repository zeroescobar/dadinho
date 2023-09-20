package aulas;

import java.util.Scanner;


public class Restaurante {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantidade de pessoas abaixo dos 13 anos: ");
        int quantAdultos = input.nextInt();
        
        System.out.println("Quantidade de pessoas acima dos 13 anos: ");
        int quantCriancas = input.nextInt();
        
        float valorAdulto = 69.90f;
        float valorCrianca = 39.90f;
        
        float gastoTotal = (quantAdultos * valorAdulto)+(quantCriancas*valorCrianca);
        
        int percentTaxaGarcom = 10;
        
        float valorTaxaGarcom = (gastoTotal / 100) * percentTaxaGarcom;
        
        float valorfinal = gastoTotal + valorTaxaGarcom;
        
        System.out.printf("Total da conta: R$%.2f\nValor da taxa do servico do garcom: R$%.2f\nTotal geral: R$%.2f",gastoTotal,valorTaxaGarcom,valorfinal);
        
    }
}
