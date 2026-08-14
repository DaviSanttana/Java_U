package Interfaces.Exercicios.Ex01;

public class WhatsApp implements Mensagem{
    @Override
    public void metodo(String mensagem) {
        System.out.println("Enviando WhatsApp: "+mensagem);
    }
}
