package section_6.aula52_estruturas_repetitivas;

import java.util.Scanner;

public class Exercio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero = numero - 1;
        }

        sc.close();


    }

}
