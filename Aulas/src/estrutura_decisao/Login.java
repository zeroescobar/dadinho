/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_decisao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Voce esta logado: ");
        boolean logado = input.nextBoolean();
        
        String msg = logado ? "OK, adm":"seja bem vindo visitante";
        System.out.println(msg);
    }
}
