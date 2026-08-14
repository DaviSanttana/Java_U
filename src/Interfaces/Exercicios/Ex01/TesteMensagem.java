package Interfaces.Exercicios.Ex01;

import java.util.List;

public class TesteMensagem {

    static void enviarParaTodos(String mensagem, List<Mensagem> servicos) {
        for (Mensagem servico:servicos) {
            servico.metodo(mensagem);
        }
    }
    static void main() {
        Mensagem sms = mensagem -> System.out.println("Enviando SMS: " + mensagem);
        Mensagem email = mensagem -> System.out.println("Enviando email: " + mensagem);
        Mensagem whatsApp = mensagem -> System.out.println("Enviando whatsApp: " + mensagem);
        Mensagem redesSociais = mensagem -> System.out.println("Enviando mensagem pela rede: " + mensagem);


        List<Mensagem> mensagems = List.of(sms,email,redesSociais,whatsApp);
        enviarParaTodos("Promoção hoje", mensagems);
    }
}
