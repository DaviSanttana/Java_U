package Interfaces.Exercicios.Ex01;

public class Sms implements Mensagem{
    @Override
    public void metodo(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
