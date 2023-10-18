package orientacao_objeto;

public class TesteClasses {
    public static void main(String[] args) {
        // Objetos para classe Aluno
        Aluno sebastiao = new Aluno();
        Aluno aline = new Aluno("Aline Soares", 19, 
                "aline@gmail.com");
        Aluno antonio = new Aluno("Antonio Silva", 25, 
                7.8f, 1.89f, "antonio@gmail.com");
        
        System.out.println("Aluno: "+ aline.getNome());
        
        System.out.println("Email: "+ aline.getEmail());
          
        aline.setAltura(1.78f);
        aline.setNota(6.9f); 
        System.out.println(aline);
        System.out.println(aline.verificarNota());
        
        // Objetos da classe Cidade
        Cidade piracicaba = new Cidade(50, 1300, 
                "Piracicaba", 256, 550000);
        Cidade saltinho = new Cidade();
        
        // Objetos da classe Computador
        Computador intel = new Computador("Dell", "Dell", 
                "Linux Mint", "Intel", 2599.90f);
        Computador amd = new Computador();
        
        // Objetos da classe Viagem
        Viagem ferias = new Viagem("Piracicaba", "Praia Grande", 
                230, "Escort 92", 3.5f);
        Viagem finalSemana = new Viagem();
    }
}









