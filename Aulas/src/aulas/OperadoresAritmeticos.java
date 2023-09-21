package aulas;

public class OperadoresAritmeticos {
    public static void main(String[] args){
        int numeroA = 40;
        int numeroB = 20;
        
        int resultadoSoma = numeroA + numeroB;
        int resultadoSubtracao = numeroA - numeroB;
        int resultadoMultiplicacao = numeroA * numeroB;
        int resultadoDivisao = numeroA / numeroB;
        int restoDivisao = numeroA % numeroB;
        
        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadoDivisao);
        System.out.println(restoDivisao);
        numeroB++;
        numeroA--;
        System.out.println(numeroB);
        System.out.println(numeroA);
    }
}
