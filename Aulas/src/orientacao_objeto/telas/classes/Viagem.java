
package telas.classes;

public class Viagem {
    private final float VALOR_LITRO_GASOLINA = 5.39f;
    private final float VALOR_LITRO_ETANOL = 3.49f;
    private String veiculo;
    private float distancia;
    private float mediaKmLitroGasolina;
    private float mediaKmLitroEtanol;

    public Viagem(String veiculo, float distancia, float mediaKmLitroGasolina, float mediaKmLitroEtanol) {
        this.veiculo = veiculo;
        this.distancia = distancia;
        this.mediaKmLitroGasolina = mediaKmLitroGasolina;
        this.mediaKmLitroEtanol = mediaKmLitroEtanol;
    }

    public float getVALOR_LITRO_GASOLINA() {
        return VALOR_LITRO_GASOLINA;
    }

    public float getVALOR_LITRO_ETANOL() {
        return VALOR_LITRO_ETANOL;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public float getDistancia() {
        return distancia;
    }

    public byte getMediaKmLitroGasolina() {
        return mediaKmLitroGasolina;
    }

    public byte getMediaKmLitroEtanol() {
        return mediaKmLitroEtanol;
    }
    
    public float calcularCustocomGasolina(){
        return (this.distancia / this.mediaKmLitroGasolina) * this.VALOR_LITRO_GASOLINA;
    }
    public float calcularCustocomEtanol(){
        return (this.distancia / this.mediaKmLitroEtanol) * this.VALOR_LITRO_ETANOL;
    }
    
    public String verificarCombustivelMaisEconomico(float valorTotalGasolina, float valorTotalEtanol){
        String msgcomb = "";
        if(valorTotalGasolina < valorTotalEtanol){
            return String.format("Para gasolina sera gasto R$ %.2f", valorTotalGasolina);
        }else{
            return String.format("Para etanol sera gasto R$ %.2f", valorTotalEtanol);
            
        }
    }
}
