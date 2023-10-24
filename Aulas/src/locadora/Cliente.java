
package locadora;

public class Cliente implements AluguelFilme,ValidaCliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email)  {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public double AlugarFilmeSimples(int qtdeDias) {
        return qtdeDias * VALOR_ALUGUEL_FILME_SIMPLES;
    }

    @Override
    public double alugarFilmeLancamento(int qtdeDias, boolean feriado) {
        if(feriado){
            return (qtdeDias * VALOR_ALUGUEL_LANCAMENTO) + 5.00;
        }
        else{
            return qtdeDias * VALOR_ALUGUEL_LANCAMENTO;
        }
    }

    @Override
    public boolean validarNome(String nome) {
        if(nome.length() > 4){
            return true;
        }else{
            System.out.println("Nome invalido");
            return false;
        }
    }

    @Override
    public boolean validarEmail(String email) {
        if(email.contains("@gmail.com")){
            return true;
        }else{
            System.out.println("Email invalido");
            return false;
        }
    }
    
}
