package ProgramacaoOrientadaObjetos.Aula2.ExFixacao.entities;

public class Converter {
    public static final double DOLLARQUOTE = 5.18;
    public static final double IOF = 0.0350; // 3,50%

    public static double TotalDollarBuy(double dollarToBuy) {
        return (dollarToBuy *(1-  IOF ))/DOLLARQUOTE;
    }
}
