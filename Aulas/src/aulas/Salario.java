package aulas;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome do funcionario: ");
        String nome = input.nextLine();
        
        System.out.println("Salario atual: ");
        float salarioOld = input.nextFloat();
       
        int percentAument = 17;
        float valorAumento = (salarioOld / 100)* percentAument;
        float salarioNew = salarioOld + valorAumento;
        System.out.printf("Nome: %s\nSalario antigo: R$%.2f\nPorcentagem de aumento:%s\nValor aumento: R$%.2f\nNovo salario: R$%.2f\n", nome,salarioNew,percentAument, valorAumento,salarioNew);
        input.close();
    }
}
