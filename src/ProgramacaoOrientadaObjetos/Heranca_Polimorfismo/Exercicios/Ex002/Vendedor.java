package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Vendedor extends Usuarios{
    private int quantidadeVendas;
    private static final boolean ADMINISTRADOR = false;

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha);
        this.quantidadeVendas = quantidadeVendas;
    }
}
