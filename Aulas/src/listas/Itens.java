/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class Itens {
    public static void main(String[] args) {
        int[] numeros = {10,11,12,13,14,15,16,17,18,19,110};
        System.out.println("numero na posicao 2:" + numeros[2]);
        
        int[] numero2 = new int[101];
        for(int i = 0;i<=100;i++){
            numero2[i] = i;
        }
        System.out.println(Arrays.toString(numero2));
        
        String[] cidades = {"Piracicaba","Campinas","Jau","Charqueada","Rio das pedras"};
        
        System.out.println(Arrays.toString(cidades));
        
        float[] notas = {1.1f,3.4f,5.9f,10f,10f};
        
        System.out.println(Arrays.toString(notas));
    }
}
