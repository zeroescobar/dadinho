/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Scooter extends Veiculo{
    private int potenciaBateria;

    public Scooter(String descricao, int ano, String cor, int km, boolean zeroKm, boolean freioAbs, double valor) {
        super(descricao, ano, cor, km, zeroKm, freioAbs, valor);
    }
}
