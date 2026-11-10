package section_8.aula74_segundo_problema_exemplo;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString(){
        return
        
        nome
        + ", $ "
        + String.format("%.2f", preco)
        + ", "
        + quantidade
        + " unidade, Total: $ "
        + String.format("%.2f", valorTotalEmEstoque());

    }

}
