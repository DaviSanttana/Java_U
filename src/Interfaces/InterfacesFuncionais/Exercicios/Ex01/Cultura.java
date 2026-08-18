package Interfaces.InterfacesFuncionais.Exercicios.Ex01;

public class Cultura implements Produto {
    private double valor;


    public Cultura(double valor) {
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
        return valor * 0.04;
    }
}
