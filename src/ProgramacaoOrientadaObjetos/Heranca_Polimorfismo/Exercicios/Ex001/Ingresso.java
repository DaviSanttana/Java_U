package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex001;

public sealed abstract class Ingresso permits MeiaEntrada, IngressoFamilia {
    protected final double valor = 45;
    protected String nomeFilme;
    protected String idioma;

    public Ingresso(String nomefilme, String idioma) {
        this.nomeFilme = nomeFilme;
        this.idioma = idioma;
    }

    public Ingresso() {
    }

    public double getValor() {
        return valor;
    }

    public String getnomeFilme() {
        return nomeFilme;
    }

    public void setnomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
