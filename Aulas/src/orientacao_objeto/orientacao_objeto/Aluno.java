package orientacao_objeto;

public class Aluno {
    private String nome;
    private int idade;
    private float nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private float altura;
    private String email;

    public Aluno() {
    }

    public Aluno(String nome, int idade, float nota, 
            float altura, String email) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.altura = altura;
        this.email = email;
    }

    public Aluno(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", nota=" + nota + ", altura=" + altura + ", email=" + email + '}';
    }
    
    public boolean verificarNota(){
        if(this.nota >= 6.0){
            return true;
        }else{
            return false;
        }
    }
    public void verificarMaiorIdade(){
        if(this.idade >= 18){
            System.out.println("Voce e maior de idade");
        }else{
            System.out.println("Voce e menor de idade");
        }
    }
    
}
