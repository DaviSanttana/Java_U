package EstruturaSequencial_Section_4.Aulas;

import java.util.Locale;

public class ChamadaDeVariavel {
    public static void main(String[] args) {
        int x = 12;
        String nome = "Davi";
        double renda = 2500;
        double y = 155.013121660;
        Locale.setDefault(Locale.US);// Configurando a localização do programa para usar o '.' dos estados unido
        System.out.println(x); // chamando a variavel
        System.out.printf("A variavel y vale %.2f%n",+y);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,x , renda);
        System.out.print("A variavel x vale "+x);

    }
}
