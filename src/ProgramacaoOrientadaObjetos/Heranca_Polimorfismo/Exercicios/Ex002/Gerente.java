package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Gerente extends Usuarios{
    private static final boolean ADMINISTRADOR = true;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

}
