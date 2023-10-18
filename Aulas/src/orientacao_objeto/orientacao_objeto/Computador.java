package orientacao_objeto;

public class Computador {
    private String mouseMarca;
    private String tecladoMarca;
    private String sistemaOperacional;
    private String CPU;
    private float preco;

    public Computador() {
    }
    
    public Computador(String mouseMarca, String tecladoMarca, String sistemaOperacional, String CPU, float preco) {
        this.mouseMarca = mouseMarca;
        this.tecladoMarca = tecladoMarca;
        this.sistemaOperacional = sistemaOperacional;
        this.CPU = CPU;
        this.preco = preco;
    }

    public String getMouseMarca() {
        return mouseMarca;
    }

    public void setMouseMarca(String mouseMarca) {
        this.mouseMarca = mouseMarca;
    }

    public String getTecladoMarca() {
        return tecladoMarca;
    }

    public void setTecladoMarca(String tecladoMarca) {
        this.tecladoMarca = tecladoMarca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
