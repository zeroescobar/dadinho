package aulas;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        /**
         * Criar um programa que calcule a area
         * do circulo e pedir o raio
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        float raio = input.nextFloat();
        final float PI = 3.141516f;
        
        float areaExata = (float) (Math.PI * (raio * raio));
        float areaAproximada = PI * (raio*raio);
        
        System.out.println("Area exata "+areaExata +"\nArea aproximada: "+areaAproximada);
    }
}
