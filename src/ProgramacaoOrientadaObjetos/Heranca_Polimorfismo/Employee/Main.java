package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Employee;

public class Main {

    static void main() {
        Employee maneger =  new Maneger();
        maneger.setName("Joao");
        maneger.setLogin("joao23");
        maneger.setPassword("23234");


        System.out.println(maneger.getName());
        System.out.println(maneger.getLogin());
        System.out.println(maneger.getPassword());



        Salesman salesman = new Salesman();
    }
}
