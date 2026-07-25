package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public sealed abstract class Usuarios permits Gerente,Vendedor,Atendente{
    private String nome;
    private String email;
    private String senha;


    public Usuarios(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
