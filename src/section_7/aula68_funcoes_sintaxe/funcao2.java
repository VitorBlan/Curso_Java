package section_7.aula68_funcoes_sintaxe;

import java.util.Scanner;

public class funcao2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 numero:");

        int numero1 = sc.nextInt(); /*digitar o numero 1 */
        int numero2 = sc.nextInt(); /* digitar o numero 2 */
    
        /*variavel */
        int maiorNumero = (max(numero1, numero2));

        System.out.println("Higher = " + maiorNumero);

        sc.close();
    }
                        /*             */
    public static int max(int a, int b) {
        int maior;

        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }

        return maior;
    }

}
