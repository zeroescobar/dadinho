/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objeto;

/**
 *
 * @author Aluno
 */
public class Computador {
    private String mouseMarca;
    private String tecladoMarca;
    private String sistemaOperacional;
    private String CPU;
    private float preco;

    public Computador(String mouseMarca, String tecladoMarca, String sistemaOperacional, String CPU, float preco) {
        this.mouseMarca = mouseMarca;
        this.tecladoMarca = tecladoMarca;
        this.sistemaOperacional = sistemaOperacional;
        this.CPU = CPU;
        this.preco = preco;
    }

    public Computador() {
    }
}
