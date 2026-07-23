package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex001;

public non-sealed class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(String nomefilme, String idioma, int numeroPessoas) {
        super(nomefilme, idioma);
        this.numeroPessoas = numeroPessoas;
    }

    public IngressoFamilia() {
    }

    @Override
    public double getValor() {
        double valorTotal = super.getValor() * this.numeroPessoas;
        if (this.numeroPessoas > 3) {
            valorTotal = valorTotal * 0.95;
        }
        return valorTotal;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }
}
