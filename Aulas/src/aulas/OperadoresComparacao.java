
package aulas;

public class OperadoresComparacao {
    public static void main(String[] args){
        int numeroA = 78;
        int numeroB = 90;
        
        boolean numeroAigualNumeroB = numeroA == numeroB;
        System.out.println(numeroAigualNumeroB);
        
        boolean numeroADiferenteNumeroB = numeroA != numeroB;
        System.out.println(numeroADiferenteNumeroB);
        
        boolean numeroAMaiorNumeroB = numeroA > numeroB;
        System.out.println(numeroAMaiorNumeroB);
        
        boolean numeroAMaiorIgualNumeroB = numeroA >= numeroB;
        System.out.println(numeroAMaiorIgualNumeroB);
        
        boolean numeroAMenorNumeroB = numeroA < numeroB;
        System.out.println(numeroAMenorNumeroB);
        
        boolean numeroAMenorIgualNumeroB = numeroA <= numeroB;
        System.out.println(numeroAMenorIgualNumeroB);
    }
}
