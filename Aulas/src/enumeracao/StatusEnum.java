/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public enum StatusEnum {
    EM_PREPARACAO("Em preparação"),
    EM_TRANSPORTE("Em transporte"),
    ENTREGUE("Entregue ao cliente"),
    DEVOLVIDO("Devolvido pelo cliente");
    private String status;

    public String getStatus() {
        return status;
    }

    private StatusEnum(String status){
        this.status =  status;
    }
    
    
}
