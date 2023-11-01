package listas;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
       List<Integer> numeros = new ArrayList<>();
       
        for (int i = 0; i < 100; i++) {
            numeros.add(i);
        }
        System.out.println(Arrays.asList(numeros));
        
        System.out.println("Posicao 10 " + numeros.get(10));
        

        try {
            List<String> cidades = new ArrayList<>();
            cidades.add("Piracicaba");
            cidades.add("Charqueada");
            System.out.println(cidades.get(2));
            System.out.println(Arrays.asList(cidades));
        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOO");
        } finally {
            System.out.println("TERMINADO");
        }
        
        
        
        
        List<Double> notas = new ArrayList<>();
        notas.addAll(Arrays.asList(2.6, 7.8, 1.2));
        
        Aluno a1 = new Aluno("Samanta", 4.5, 6.0, 1);
        Aluno a2 = new Aluno("Sebastiao", 2.6, 9.0, 2);
        Aluno a3 = new Aluno("Barbara", 6.7, 7.8, 6);
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.addAll(Arrays.asList(a1, a2, a3));
        System.out.println(alunos);
        
        for(Aluno aluno : alunos){
            aluno.calcularMedia();
            aluno.verificarSituacao();
        }
        
    }        
}
