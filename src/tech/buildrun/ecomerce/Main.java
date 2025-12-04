package tech.buildrun.ecomerce;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 0);
        Produto p2 = new Produto("Calça", 119.90);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(null); //

        System.out.println("Total: " + carrinho.calcularTotal());
    }
}
