package orientacao_objeto;

public class Aluno {
        private String nome;
        private  byte idade;
        private float nota;
        private float altura;
        private String email;

    public Aluno() {
    }

    public Aluno(String nome, byte idade, float nota, float altura, String email) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.altura = altura;
        this.email = email;
    }
        
    
}
