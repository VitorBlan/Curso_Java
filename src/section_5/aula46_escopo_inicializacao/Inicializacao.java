package section_5.aula46_escopo_inicializacao;

/*public class Inicializacao {
    public static void main(String[] args) {
        
    double price = 400;

    if (price<200.00) {
        
        double desconto = price * 1;
    }

    System.out.printf("o desconto é %f",desconto);

    }

} 
    
não funcionar por que variavele está fora da estrutura

*/




public class Inicializacao {
    public static void main(String[] args) {
        
    double price = 400;
    double desconto = 0; /*deve ser definido um valor inicial */

    if (price<200.00) {
        
       desconto = price * 1;
    }

    System.out.printf("o desconto é %f",desconto);

    }

}
