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

    public Usuarios() {
    }

    public boolean realizarLogin(String email, String senha) {
        if (this.email.equalsIgnoreCase(email) && this.senha.equals(senha)) {
            System.out.println("Login realizado com sucesso! Bem-vindo, " + getNome() + ".");
            return true;
        }
        System.out.println("Erro: E-mail ou senha incorretos.");
        return false;
    }

    public String realizarLogoff() {
        return "Sessão encerrada para o usuário " + getNome() + ".";
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

    public void alterarSenha(String novaSenha) {
        if (novaSenha != null && !novaSenha.trim().isEmpty()) {
            setSenha(novaSenha);
        }
        System.out.println("Senha atualizada com sucesso.");
    }

    public abstract boolean isAdministrador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
