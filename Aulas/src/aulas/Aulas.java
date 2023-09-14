package aulas;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Aulas {
    
    /**
     * 
     * Minha primeira classe
     * <p style="background-color:red">Testeeee</p>
     * 
     * 
     * @param args
     * @throws UnsupportedEncodingException 
     */
  
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out,true,"UTF-8"));
        System.out.println("olá mundo");
        System.out.println("qtde de argumentos: " + args.length);
        
        try {
            String tt = "";
            for(int i = 0;i< args.length;i++){
                tt += args[i] + ", ";
            }
            System.out.println(tt);
        } catch (Exception e) {
        }
        
        
    }
    
}
