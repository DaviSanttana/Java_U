package _ProgramacaoOrientadaObjetos.Aula1.Exemplo002.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return  "Name: "+ name + ", Price: $"+price+", Units: " + quantity + ", Total: $"+TotalValueInStock();
    }
}
