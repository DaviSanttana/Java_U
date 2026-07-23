package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex001;

public non-sealed class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String nomefilme, String idioma) {
        super(nomefilme, idioma);
    }

    public MeiaEntrada() {
    }

    @Override
    public double getValor() {
        return super.getValor() / 2.0;
    }

}
