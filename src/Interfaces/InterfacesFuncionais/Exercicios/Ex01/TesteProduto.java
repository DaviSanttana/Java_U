package Interfaces.InterfacesFuncionais.Exercicios.Ex01;

import java.util.List;
import java.util.Locale;

public class TesteProduto {
    static void main() {
        Locale.setDefault(Locale.US);

        List<Produto> produtos = List.of(new Alimentacao(200), new SaudeBemEstar(2000),
                new Vestuario(3000), new Cultura(5000));


        double total = 0;
        for (Produto produto: produtos){
            double imposto = produto.calcularImposto();
            System.out.println(imposto);
            total += imposto;
        }
        System.out.println(total);
    }
}
