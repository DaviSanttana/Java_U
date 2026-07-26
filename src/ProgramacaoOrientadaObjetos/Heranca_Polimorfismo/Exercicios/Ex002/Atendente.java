package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Atendente extends Usuarios{
    private double valorEmCaixa;
    private static final boolean ADMINISTRADOR = false;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.valorEmCaixa = valorEmCaixa;
    }

    public Atendente() {
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
    public double receberPagamentos(double pagamento){
        valorEmCaixa = 0;
        while (pagamento <= 0){
            System.out.println("Informar um valor valido para o caixa");
        } valorEmCaixa += pagamento;
        return  valorEmCaixa;
    }

    public String fecharCaixa() {
        String s1 = "Fechando o caixa";
        String s2 = "Valor total no caixa: "+valorEmCaixa;
        return s1 + "\n" + s2;
    }
    public boolean realizarLogin(String email, String senha) {
        if (getEmail().equalsIgnoreCase(email) && getSenha().equals(senha)) {
            System.out.println("Login realizado com sucesso! Bem-vindo, " + getNome() + ".");
            return true;
        }
        System.out.println("Erro: E-mail ou senha incorretos.");
        return false;
    }

    public void realizarLogoff() {
        System.out.println("Sessão encerrada para o gerente " + getNome() + ".");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            setNome(novoNome);
        }
        if (novoEmail != null && !novoEmail.trim().isEmpty()) {
            setEmail(novoEmail);
        }
        System.out.println("Dados cadastrais atualizados com sucesso.");
    }
    public  void alterarSenha(String novaSenha){
        if (novaSenha != null && !getSenha().trim().isEmpty()) {
            setSenha(novaSenha);
        }
        System.out.println("Senha atualizada com sucesso.");
    }
    public boolean isAdministrador() {
        return this.ADMINISTRADOR;
    }
}
