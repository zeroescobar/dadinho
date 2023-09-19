
package aulas;

public class TiposPrimitivos {
    public static void main(String[] args){
        /*
        Tipos primitivos em JAVA
        */
  
        //Tipos numericos
        
        //intervalo: -128 até 127
        //Armazena 8 bits ou 1 byte.
        byte numeroByte = 127;
        
        //intervalo: -32.768 até 32.767
        //armazena 16 bits ou 2 bytes
        short numeroShort = 16902;
        
        //intervalo: -2.147.483.648 até 2.147.483.647
        //armazena 32 bits ou 4 bytes
        int numeroInt = 2147222222;
        
        //intervalo -9.223.372.036.854.775.808 até 9223372036854775807
        //armazena 64 bits ou 8 Bytes
        long numeroLong = -9223372036854775808L;
        
        //Tipos númericos ponto flutuante
        
        // 32 bits ou 4 Bytes, com precisão simples
        //Precisa colocar f no final, senão o compilador
        //vai considerar double
        float numeroFloat = 21.4734f;
        
        //64 bits ou 8 bytes com maior precisão
        double numeroDouble = 34.123456;
        
        /*
        Tipo verdadeiro ou falso
        */
        // 1 bit
        boolean estudando = true;
        boolean estaDeFolga = false;
        
        /*
        Tipo caractere
        */
        // 16 bits ou 2 bytes
        char letra = 'M';
    }
    
    
}
