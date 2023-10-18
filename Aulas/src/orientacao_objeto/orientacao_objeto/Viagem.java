package orientacao_objeto;

public class Viagem {
    private String cidadePartida;
    private String destino;
    private int distancia;
    private String veiculo;
    private float tempoHoras;

    public String getCidadePartida() {
        return cidadePartida;
    }

    public void setCidadePartida(String cidadePartida) {
        this.cidadePartida = cidadePartida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public float getTempoHoras() {
        return tempoHoras;
    }

    public void setTempoHoras(float tempoHoras) {
        this.tempoHoras = tempoHoras;
    }

    public Viagem() {
    }

    public Viagem(String cidadePartida, String destino, int distancia, String veiculo, float tempoHoras) {
        this.cidadePartida = cidadePartida;
        this.destino = destino;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.tempoHoras = tempoHoras;
    }
    
}
