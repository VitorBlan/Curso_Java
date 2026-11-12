package section_8.aula77_exercicios_de_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    exercicio2_class emp = new exercicio2_class();

    System.out.print("name: ");
    emp.name = sc.nextLine();


    System.out.println("Gross salarary");
    emp.grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    emp.tax = sc.nextDouble();

    System.out.println();
    System.out.println("Employee: " + emp);
    System.out.println();
    System.out.print("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    emp.increaseSalary(percentage);
    System.out.println();
    System.out.println("Updated data: " + emp);

    sc.close();

}


}
