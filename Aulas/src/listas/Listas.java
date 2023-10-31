/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Listas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);
        System.out.println("pos 10: "+numeros.get(10));
        
        List<String> cidades = new ArrayList<>();
        cidades.add("Piracicaba");
        cidades.add("Charqueada");
        System.out.println(cidades);
        System.out.println("pos 10: "+cidades.get(0));
        
        List<Double> notas = new ArrayList<>();
        
        notas.addAll(Arrays.asList(2.6,4.5,3.4,7.1));
        
        
        
    }
}
