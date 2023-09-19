package aulas;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){
        /*
        Utilizando entrada de dados com scaner
        precisa importar a classe scanner
        import java.util.Scanner
        */
        
        /**
         * Pergunte ao usuario seu nome, o ano que nasceu
         * calcule sua idade com base no ano atual
         * mostre uma mensagem na saida com as informações
         */
        
        // Declaração do scanner
        Scanner input = new Scanner(System.in);
        
        //entrada de dados
        //nome
        System.out.println("Qual seu nome? ");
        String nome = input.nextLine();
        
        //idade
        System.out.println("O ano que voce nasceu");
        short anoNascimento = input.nextShort();
        
        //processamento
        short anoAtual = 2023;
        short idade = (short) (anoAtual - anoNascimento);
        
        //saida
        System.out.println("Seja bem vindo "+ nome + " voce tem "+idade+" anos.");
        input.close();
        
    }
    
}
