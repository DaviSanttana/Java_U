package Interfaces.Exercicios.Ex01;

public class RedesSociais implements Mensagem{
    @Override
    public void metodo(String mensagem) {
        System.out.println("Enviando mensagem na rede: "+mensagem);
    }
}
