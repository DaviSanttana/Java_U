package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Atendente extends Usuarios {
    private double valorEmCaixa;
    private static final boolean ADMINISTRADOR = false;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.valorEmCaixa = valorEmCaixa;
    }

    public Atendente() {
    }

    @Override
    public boolean isAdministrador() {
        return false;
    }

    public void receberPagamentos(double pagamento) {
        if (pagamento <= 0) {
            System.out.println("Informar um valor valido para o caixa");
            return;
        }
        this.valorEmCaixa += pagamento;
        System.out.println("Pagamento de " + pagamento + " recebido.");
    }

    public String fecharCaixa() {
        return "Fechando o caixa... Valor total no caixa: " + valorEmCaixa;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
