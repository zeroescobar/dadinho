/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class TesteEnum {
    
    public static void main(String[] args) {
        Usuario comum = new Usuario("comum123", "123", "comum@gmail.com", "usuario comum", "19 99123", TipoUserEnum.COMUM);
        Usuario tecnico = new Usuario("comum123", "123", "comum@gmail.com", "usuario comum", "19 99123", TipoUserEnum.TECNICO);
        Usuario adminUsuario = new Usuario("comum123", "123", "comum@gmail.com", "usuario comum", "19 99123", TipoUserEnum.ADMINISTRADOR);
        
        
        Produto detergente = new Produto("ype", 2.99, StatusEnum.EM_PREPARACAO);
        
        System.out.println(detergente.toString());
    }
}
