package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Gerente extends Usuarios {
    private static final boolean ADMINISTRADOR = true;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public Gerente() {
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
    public boolean isAdministrador() {
        return this.isAdministrador();
    }

}
