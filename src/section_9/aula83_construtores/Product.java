package section_9.aula83_construtores;

public class Product {

    public String name ;
    public double price;
    public int quantity;

    public Product(String nome , double preco , int quantidade){
    
        this.name = nome;
        this.price = preco;
        this.quantity = quantidade;

    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantidade) {
        this.quantity += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantity -= quantidade;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
