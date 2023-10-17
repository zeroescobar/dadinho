/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objeto;

/**
 *
 * @author Aluno
 */
public class Viagem {
    public String cidadePartida;
    public String destino;
    public int distancia;
    public String veiculo;
    public float tempoHoras;

    public Viagem(String cidadePartida, String destino, int distancia, String veiculo, float tempoHoras) {
        this.cidadePartida = cidadePartida;
        this.destino = destino;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.tempoHoras = tempoHoras;
    }

    public Viagem() {
    }
}
