/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Veiculo 
{
    private String descricao;
    private int ano;
    private String cor;
    private int km;
    private boolean zeroKm;
    private boolean freioAbs;
    private double valor;
    
     public Veiculo(String descricao, int ano, String cor, int km, boolean zeroKm, boolean freioAbs, double valor) {
        this.descricao = descricao;
        this.ano = ano;
        this.cor = cor;
        this.km = km;
        this.zeroKm = zeroKm;
        this.freioAbs = freioAbs;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "descricao=" + descricao + ", ano=" + ano + ", cor=" + cor + ", km=" + km + ", zeroKm=" + zeroKm + ", freioAbs=" + freioAbs + ", valor=" + valor + '}';
    }

}
