package aulas;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome do Produto: ");
        String nomeProduto = input.nextLine();
        
        System.out.println("Valor do Produto: ");
        float valorProduto = input.nextFloat();
        
        System.out.println("Percentual de Desconto:");
        byte percentDesconto = input.nextByte();
        
        float valorDesconto = (valorProduto  / 100) * percentDesconto;
        
        float novoValorProduto = valorProduto - valorDesconto;
        
        System.out.printf("Nome do Produto: %s\nValor original: R$%.2f\nValor com desconto: R$%.2f\nValor do desconto: R$ %.2f\n",nomeProduto, valorProduto, novoValorProduto,valorDesconto);
        
        input.close();
    }
}
