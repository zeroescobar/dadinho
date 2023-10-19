
package telas.classes;


public class Viagem {
    private final float VALOR_LITRO_GASOLINA = 5.39f;
    private final float VALOR_LITRO_ETANOL = 3.49f;
    
    private String veiculo;
    private float distancia;
    private int mediaKmLitroGasolina;
    private int mediaKmLitroEtanol;

    public Viagem(String veiculo, float distancia, int mediaKmLitroGasolina, int mediaKmLitroEtanol) {
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

    public int getMediaKmLitroGasolina() {
        return mediaKmLitroGasolina;
    }

    public int getMediaKmLitroEtanol() {
        return mediaKmLitroEtanol;
    }
    
    public float custoComGasolina(){
    return (this.distancia /  this.mediaKmLitroGasolina) * VALOR_LITRO_GASOLINA;
    }
    
    public float custoComEtanol(){
    return (this.distancia /  this.mediaKmLitroEtanol) * VALOR_LITRO_ETANOL;
    }
    
    public String verificarCombustivelMaisBarato(float valorTotalGasolina, float valorTotalEtanol ){
    String mensagemCombustivel = "";
        
        // Tratando a condição do combustível mais barato
        if (valorTotalGasolina < valorTotalEtanol) {
            // Gasolina mais barato
           return String.format("\nPara gasolina será gasto R$ %.2f", valorTotalGasolina);
        } else {
            // Etanol mais barato
            return String.format("\nPara etanol será gasto R$ %.2f", valorTotalEtanol);
        }
    }
}
