package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Atendente extends Usuarios{
    private double valorEmCaixa;
    private static final boolean ADMINISTRADOR = false;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
    }
}
