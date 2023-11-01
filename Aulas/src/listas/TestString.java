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
public class TestString {
    public static void main(String[] args) {
        String cidade = "Piracicaba";
        int tamanho = cidade.length();
        
        System.out.println(tamanho);
        
        String mensagem = " Eh muito linda :)";
        
        System.out.println(cidade.concat(mensagem));
        
        int idadevalor = Integer.parseInt("34");
        
        String naao = Integer.toString(14);
        
        String bairo = "wewe";
        
        String pletra = String.valueOf(bairo.charAt(0));
        
        String uletra = String.valueOf(bairo.charAt(bairo.length()-1));
        System.out.println("Primeira letra da palavra "+ bairo+ "é "+pletra+"ultima é "+ uletra);
        
        
        String cidadee = "Piracicaba";
        String pt1 = cidadee.substring(0,4);   //PIRA
        String pt2 = cidadee.substring(4);  //CICABA
        System.out.println(pt1);
        
        String escola = "Senai mario henrique simonsen";
        String[] poartes = escola.split(" ");
        System.out.println(Arrays.toString(poartes));
        
        String curso = "     ELETRO ELETRONICA         ";
        System.out.println(curso.trim());
        System.out.println(curso.toLowerCase());
        System.out.println(curso.toUpperCase());
        
        String ult = String.valueOf(escola.lastIndexOf("u"));
        System.out.println(ult);
        String prim = String.valueOf(escola.indexOf("u"));
        System.out.println(prim);
        String subst = escola.replace(" ", "_");
        System.out.println(subst);
        String substf = escola.replaceFirst(" ", "_");
        System.out.println(substf);
        
        String email = "aluno@gmail.com";
        System.out.println(email.contains("@gmail.com")); //BOOLEADO
        
        String est = "estudando é muioto importste";
        System.out.println(est.endsWith("importste")); //BOOLEADO
        
        String est2 = "estudando é muioto importste";
        System.out.println(est2.startsWith("importste")); //BOOLEADO
        
        String estu1 = "aluno1";
        String estu2 = "aluno2";
        System.out.println(estu1.compareTo(estu2)); //BOOLEADO
    }
}
