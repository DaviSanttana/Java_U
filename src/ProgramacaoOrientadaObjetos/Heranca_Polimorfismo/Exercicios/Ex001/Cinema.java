package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex001;

public class Cinema {
    static void main() {
        printCinema(new MeiaEntrada());
        printCinema(new IngressoFamilia());
    }

    public static void printCinema(Ingresso ingressoCinema) {
        switch (ingressoCinema) {
            case MeiaEntrada meiaEntrada -> {
                meiaEntrada.setnomeFilme("Homem-Aranha");
                meiaEntrada.setIdioma("Dublado");

                System.out.println(meiaEntrada.getnomeFilme());
                System.out.println(meiaEntrada.getIdioma());
                System.out.println(meiaEntrada.getValor());
                System.out.println("\n =============== \n");
            }

            case IngressoFamilia ingressoFamilia -> {
                ingressoFamilia.setnomeFilme("Moana");
                ingressoFamilia.setIdioma("Legendado");
                ingressoFamilia.setNumeroPessoas(4);

                System.out.println(ingressoFamilia.getnomeFilme());
                System.out.println(ingressoFamilia.getIdioma());
                System.out.println(ingressoFamilia.getNumeroPessoas());
                System.out.println(ingressoFamilia.getValor());
            }
        }
    }
}
