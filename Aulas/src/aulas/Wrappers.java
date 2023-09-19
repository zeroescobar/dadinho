
package aulas;

public class Wrappers {
    
    public static void main(String[] args){
        /*
        Exemplo de wrappers em Java
        */
        Byte diaSemana = Byte.valueOf("29");
        System.out.println("valor: "+diaSemana);
        System.out.println("classe: "+diaSemana.getClass());
        System.out.println("bytes q ocupa: "+Byte.BYTES);
        
        System.out.println("-----------------------");
        
        Short ano = Short.valueOf("2023");
        System.out.println("valor: "+ano);
        System.out.println("classe: "+ano.getClass());
        System.out.println("bytes q ocupa: "+Short.BYTES);
        
        System.out.println("-----------------------");
        
        Integer idade = Integer.valueOf("40");
        System.out.println("valor: "+idade);
        System.out.println("classe: "+idade.getClass());
        System.out.println("bytes q ocupa: "+Integer.BYTES);
        
        System.out.println("-----------------------");
        
        Long numero = Long.valueOf("1231234");
        System.out.println("valor: "+numero);
        System.out.println("classe: "+numero.getClass());
        System.out.println("bytes q ocupa: "+Long.BYTES);
        
        System.out.println("-----------------------");
    }
}
