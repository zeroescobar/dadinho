
package locadora;

public interface AluguelFilme {
    double VALOR_ALUGUEL_FILME_SIMPLES = 3.99;
    double VALOR_ALUGUEL_LANCAMENTO = 6.99;
    
    double AlugarFilmeSimples(int qtdeDias);
    double alugarFilmeLancamento(int qtdeDias, boolean feriado);
}
