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


                System.out.println(gerente.getNome());
                System.out.println(gerente.getEmail());
                System.out.println(gerente.realizarLogin("joao23@gmail", "12345"));
                System.out.println("É administrador do sistema: " + gerente.isAdministrador());

            }
            case Atendente atendente -> {
                atendente.setNome("Lucas");
                atendente.setEmail("lucas12@gmail");
                atendente.setValorEmCaixa(2800);

                System.out.println(atendente.getNome());
                System.out.println(atendente.getEmail());
                System.out.println(atendente.getValorEmCaixa());
                System.out.println(atendente.realizarLogin("joao23@gmail", "12345"));
                System.out.println("É administrador do sistema: " + atendente.isAdministrador());
                System.out.println(atendente.receberPagamentos(200));
                System.out.println(atendente.fecharCaixa());

            }
            case Vendedor vendedor -> {
                vendedor.setNome("Isaque");
                vendedor.setEmail("isaque2@gmuail");
                vendedor.setQuantidadeVendas(20);
                vendedor.realizarVenda(10);

                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getEmail());
                System.out.println("É administrador do sistema: " + vendedor.isAdministrador());


            }
        }
    }
}
