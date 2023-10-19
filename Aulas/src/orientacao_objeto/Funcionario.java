package orientacao_objeto;

public class Funcionario {

    private String nome;
    private float percentual;
    private double salarioAtual;

    public Funcionario(String nome, byte percentual, double salarioAtual) {
        this.nome = nome;
        this.percentual = percentual;
        this.salarioAtual = salarioAtual;
    }

    public double calcularAumento() {
        float valorPercentual = percentual / 100f;
        return salarioAtual * valorPercentual;
    }

    public double calcularNovoSalario(double aumento) {
        return salarioAtual + aumento;
    }

    public String getNome() {
        return nome;
    }

    public float getPercentual() {
        return percentual;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public String avaliarMensagemAumento(double aumento) {
        if (aumento >= 150 && aumento <= 300) {
            return String.format("Seu aumento foi Razoavel, R$%.2f", aumento);
        } else if (aumento >= 301 && aumento <= 450) {
            return String.format("Seu aumento foi bom, R$%.2f", aumento);
        } else if (aumento > 450) {
            return String.format("Seu aumento foi excelente, R$%.2f", aumento);
        } else {
            
            return "Valor invalido";
        }
    }

    public String mensagemSaida(double novoSalario, String mensagemValorAumento) {
        String titulo = String.format("Segue as informações do aumento do salário do funcionário %s\n", nome);
        String mensagemSalario = String.format("Salário antigo R$ %.2f\n", salarioAtual);
        String mensagemNovoSalario = String.format("Novo salário R$ %.2f\n", novoSalario);
        String mensagem = titulo.concat(mensagemSalario)
                .concat(mensagemNovoSalario)
                .concat(mensagemValorAumento);
        return mensagem;
    }

}
