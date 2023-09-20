package aulas;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o modelo do seu veiculo: ");
        String modelo = input.nextLine();
        
        System.out.println("Digite em KMs a distancia a ser percorrida: ");
        float distancia = input.nextFloat();
        
        System.out.println("Digite quantos KMs o seu carro faz com um litro de gasolina: ");
        float kmPorLitroGas = input.nextFloat();
        
        System.out.println("Digite quantos KMs o seu carro faz com um litro de Etanol: ");
        float kmPorLitroEta = input.nextFloat();
        
        float gastoGasolina = distancia / kmPorLitroGas;
        float gastoEtanol = distancia / kmPorLitroEta;
        float PRECOGAS = 5.39f;
        float PRECOETA = 3.49f;
        float custoGas = gastoGasolina * PRECOGAS;
        float custoEta = gastoEtanol * PRECOETA;
        System.out.printf("\n\n\nSeu %s percorrendo uma distancia de %s Kms,\n\nGASOLINA: \n  Kms p/ litro: %s\n  Preco: R$%.2f\n  Custo final: R$%.2f\n\nETANOL: \n  Kms p/ litro: %s\n  Preco: R$%.2f\n  Custo final: R$%.2f\n\n",modelo,distancia,kmPorLitroGas,PRECOGAS,custoGas,kmPorLitroEta,PRECOETA,custoEta);
        if(custoEta > custoGas){
            System.out.println("Gasolina fica mais em conta");
        }else{
            System.out.println("Etanol fica mais em conta");
        }
        input.close();
        
    }
}
