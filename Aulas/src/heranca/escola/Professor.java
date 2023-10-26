package heranca.escola;

public class Professor extends Pessoa{
    private String areaAtuacao;
    private boolean dedicacaoExclusiva;
    private int codigoAreaAtuacao;

    public Professor(boolean dedicacaoExclusiva, String nome, int idade, String email, AreaAtuacaoEnum areaAtuacaoEnum) {
        super(nome, idade, email);
        this.areaAtuacao = areaAtuacaoEnum.getNomeAreaAtuacao();
        this.codigoAreaAtuacao = areaAtuacaoEnum.getCodigoAreaAtuacao();
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public boolean isDedicacaoExclusiva() {
        return dedicacaoExclusiva;
    }

    public void setDedicacaoExclusiva(boolean dedicacaoExclusiva) {
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    public String toString() {
        return super.toString() +"Professor{" + "areaAtuacao=" + areaAtuacao + ", dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }
}
