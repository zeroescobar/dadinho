/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora;

/**
 *
 * @author Aluno
 */
public class Locadora {
    public static void main(String[] args) {
        Cliente silvio = new Cliente("Silvio santos");
        Cliente luciano = new Cliente("Luciano","luciano@gmail.com");
        
        double valor = silvio.AlugarFilmeSimples(3);
        double valorL = luciano.alugarFilmeLancamento(3, true);
        boolean emailL = luciano.validarEmail("luciano@gmail.com");
        System.out.println(valor);
        System.out.println(valorL);
    }
}
