
package telas.classes;


public class Produto {
    private String nome;

   
    private int percentual;
    private float valor;
    
     public Produto(String nome, int percentual, float valor) {
        this.nome = nome;
        this.percentual = percentual;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getPercentual() {
        return percentual;
    }

    public float getValor() {
        return valor;
    }
     
     public float calcularDesconto(){
         return valor *(percentual/100);
     }
}
