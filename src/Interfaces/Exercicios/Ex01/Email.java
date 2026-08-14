package Interfaces.Exercicios.Ex01;

public class Email implements Mensagem{
    @Override
    public void metodo(String mensagem) {
        System.out.println("Enviando email: "+mensagem);
    }
}
