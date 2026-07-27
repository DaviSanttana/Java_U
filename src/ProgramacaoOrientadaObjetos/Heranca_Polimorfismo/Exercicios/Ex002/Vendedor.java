package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Vendedor extends Usuarios {
    private int quantidadeVendas;
    private static final boolean ADMINISTRADOR = false;

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha);
        this.quantidadeVendas = quantidadeVendas;
    }

    public Vendedor() {
    }

    @Override
    public boolean isAdministrador() {
        return false;
    }

    public void realizarVenda() {
        this.quantidadeVendas++;
        System.out.println("Venda realizada! Total de vendas agora: " + this.quantidadeVendas);
    }

    public String consultarVendas() {
        return "Consultando vendas. Total realizadas: " + this.quantidadeVendas;
    }
    public void alterarSenha(String novaSenha) {
        if (novaSenha != null && !getSenha().trim().isEmpty()) {
            setSenha(novaSenha);
        }
        System.out.println("Senha atualizada com sucesso.");
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

}
