package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex003;

public class Company extends TaxPayer{
        private Integer numberOfEmployees;
    public Company(String name, Double anualIncome) {
        super(name, anualIncome);
    }

    public Company() {
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10 ){
            return getAnualIncome() * 0.14;
        }else {
            return  getAnualIncome() * 0.16;
        }
    }
}
