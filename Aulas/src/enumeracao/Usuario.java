/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String login;
    private String senha;
    private String email;
    private String nome;
    private String telefone;
    private TipoUserEnum tipoUser;

    public Usuario(String login, String senha, String email, String nome, String telefone, TipoUserEnum tipoUser) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.tipoUser = tipoUser;
    }
}
