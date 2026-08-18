package Interfaces.InterfacesFuncionais.Exercicios.Ex01;

public class SaudeBemEstar implements Produto{
    private double valor;

    public SaudeBemEstar(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor  *0.015;
    }
}
