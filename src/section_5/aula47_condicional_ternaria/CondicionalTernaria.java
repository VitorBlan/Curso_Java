package section_5.aula47_condicional_ternaria;

// Aula 47 - Expressão condicional ternária
public class CondicionalTernaria {
    public static void main(String[] args) {

    double preco =34.5;
    double desconto;
    
    if (preco<20.0) {
        desconto = preco * 0.1;
    }else{
        desconto = preco * 0.05;
    }

    System.out.printf("o desconto é:%f", desconto);


    }
}
