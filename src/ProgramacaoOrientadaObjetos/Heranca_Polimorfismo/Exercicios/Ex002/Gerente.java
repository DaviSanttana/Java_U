package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public non-sealed class Gerente extends Usuarios {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public Gerente() {
        super();
    }

    @Override
    public boolean isAdministrador() {
        return true;
    }

    public String gerarRelatorioFinanceiro() {
        return "Gerando relatório financeiro consolidado da empresa...";
    }

    public String consultarVendas() {
        return "Acessando painel geral de consultas de vendas...";
    }
}
