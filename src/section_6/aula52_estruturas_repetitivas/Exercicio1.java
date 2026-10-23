package section_6.aula52_estruturas_repetitivas;

public class Exercicio1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        while (x > 2) {
            System.out.println(x);
            y = y + x;
            x = x - 1;
        }

        System.out.println(y);
    }
}

/*use o debug  

x = 4,5,3,2
y = 0,5,9,(12)


*/
