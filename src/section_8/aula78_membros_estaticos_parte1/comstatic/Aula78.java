package section_8.aula78_membros_estaticos_parte1.comstatic;

import java.util.Locale;
import java.util.Scanner;

public class Aula78 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Nao precisa de "new calcular()": chama direto pelo nome da classe

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calcular.circumference(radius);
        double v = calcular.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calcular.PI);

        sc.close();
    }

}
