package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex003;

public class Individual extends TaxPayer {
    private double healthExpenditures;


    public Individual() {
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getHealthExpenditures() < 20000.0) {
            basicTax = getHealthExpenditures() * 0.15;
        } else {
            basicTax = getHealthExpenditures() * 0.25;
        }
        basicTax -= getHealthExpenditures() * 0.5;
        if (basicTax < 0) {
            return 0.0;
        } else {
            return 0;
        }
    }
}
