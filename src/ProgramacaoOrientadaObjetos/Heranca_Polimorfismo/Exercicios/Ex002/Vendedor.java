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

    public int realizarVenda(int novasVendas) {
        double valorVenda = 100;
        int totalVendas = 0;
        if (novasVendas <= 0) {
            System.out.println("Favor informar numero valido de vendas.");
        }
        totalVendas += (novasVendas * valorVenda);
        return totalVendas;
    }
    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatorios");
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas");

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

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
    public boolean isAdministrador() {
        return this.ADMINISTRADOR;
    }
}
