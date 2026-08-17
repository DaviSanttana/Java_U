package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Exercicios.Ex003;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;


    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.println("Enter the number of taxpayers:");
        int taxPayer = sc.nextInt();

        for (int i = 0; i < taxPayer; i++) {
            System.out.println("TaxPayer #" + i + "data:");
            System.out.println("Individual or company (i/c)?");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (type == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Individual x = new Individual(name, anualIncome, healthExpenditures.longValue());
                list.add(x);
            } else {
                System.out.println("Number of employees: ");
                Integer NumberOfEmployees = sc.nextInt();
                Individual x = new Individual(name, anualIncome, NumberOfEmployees.longValue());
                list.add(x);

            }
            System.out.println();
            System.out.println("Taxes PAID");
            for (TaxPayer tp : list) {
                System.out.println(tp.getName()+": $ "+ tp.getAnualIncome());
            };

        }

        sc.close();
    }
}
