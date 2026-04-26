package ProgramacaoOrientadaObjetos.Desafios.Fixacao01.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        double p = 2 * (width + height);
        return p;
    }
    public double diagonal(){
        double d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return d;
    }

    @Override
    public String toString() {
        return "Area: " + area() + "\n"+
                "Perimeter: " + perimeter() + "\n"+
                "Diagonal: " + diagonal();
    }

}
