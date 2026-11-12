package section_8.aula79_membros_estaticos_parte2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

    

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é a cotação do dólar? ");
        double cotacao = sc.nextDouble();

        System.out.print("Quantos dólares você quer comprar? ");
        double quantidade = sc.nextDouble();

        Calcular calc = new Calcular();
        
        double total = calc.dolarParaReal(quantidade, cotacao);
        System.out.printf("Valor a ser pago em reais = %.2f%n", total);

        sc.close();
    }
}
