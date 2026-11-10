package section_8.aula74_segundo_problema_exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Digite os dados do produto: ");

        System.out.print("Nome: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();


        System.out.println("Dados do produto: " + produto.toString());

        System.out.println("Digite uma numero para ser removida do estoque");
        int quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);
        System.out.println("Dados atualizados: " + produto);


        System.out.println("Digite uma numero para ser adicionado a o estoque");
        quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);
        

        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        

        sc.close();
    }


}