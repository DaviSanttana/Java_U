package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex002;

public class Main {
    static void main() {
        printUsuarios(new Gerente());
        printUsuarios(new Atendente());
        printUsuarios(new Vendedor());
    }

    public static void printUsuarios(Usuarios usuarios) {
        switch (usuarios) {
            case Gerente gerente -> {
                gerente.setNome("João");
                gerente.setEmail("joao23@gmail");
                gerente.setSenha("12345");

                System.out.println("Nome do gerente: " + gerente.getNome());
                System.out.println("email do gerente: " + gerente.getEmail());
                if (gerente.realizarLogin("joao23@gmail", "12345") == true) {
                    System.out.println("Login realizado com sucesso");
                    System.out.println("É administrador do sistema: " + gerente.isAdministrador());
                    System.out.println(gerente.gerarRelatorioFinanceiro());
                    System.out.println(gerente.consultarVendas());
                    System.out.println("Sessão encerada com sucesso: " + gerente.realizarLogoff());
                    System.out.print("\n");
                }
                System.out.print("\n");
            }
            case Atendente atendente -> {
                atendente.setNome("Lucas");
                atendente.setEmail("lucas12@gmail");
                atendente.setSenha("8989");
                atendente.setValorEmCaixa(2800);

                System.out.println("Nome do atendente: " + atendente.getNome());
                System.out.println("Email do atendente: " + atendente.getEmail());
                if (atendente.realizarLogin("lucas18@gmail", "8989") == true) {
                    System.out.println("Login realizado com sucesso");
                    System.out.println("É administrador do sistema: " + atendente.isAdministrador());
                    atendente.receberPagamentos(200.00);
                    System.out.println("Valor em caixa: " + atendente.getValorEmCaixa());
                    System.out.println(atendente.fecharCaixa());
                    System.out.println("Sessão encerada com sucesso: " + atendente.realizarLogoff());

                    System.out.println("\n");
                }
                System.out.print("\n");
            }

            case Vendedor vendedor -> {
                vendedor.setNome("Isaque");
                vendedor.setEmail("isaque2@gmail");
                vendedor.setSenha("4554");
                vendedor.setQuantidadeVendas(20);

                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getEmail());
                if (vendedor.realizarLogin("isaque2@gmail", "4554") == true) {
                    System.out.println("É administrador do sistema: " + vendedor.isAdministrador());
                    System.out.println("Numero de vendas: "+vendedor.getQuantidadeVendas());
                    vendedor.realizarVenda();
                    System.out.println(vendedor.consultarVendas());
                    System.out.println("Sessão encerada com sucesso: " + vendedor.realizarLogoff());
                }
                System.out.print("\n");
            }
        }
    }
}