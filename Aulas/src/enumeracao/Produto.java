/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Produto {
    private String descricao;
    private double valor;
    private StatusEnum status;

    public Produto(String descricao, double valor, StatusEnum status) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", valor=" + valor + ", status=" + status.getStatus() + '}';
    }
}
