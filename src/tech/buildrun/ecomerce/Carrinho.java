package tech.buildrun.ecomerce;
import java.util.List;
import java.util.ArrayList;

public class Carrinho {

   private ArrayList<Produto> produtos;


   public Carrinho () {
       this.produtos = new ArrayList<>();
   }


   public void adicionarProduto(Produto p) {
       if (p == null) {
           System.out.println("Produto inválido (null). Não adicionado.");
           return;
       }

       if (p.getPreco() <= 0) {
           System.out.println("Produto com preço inválido. Não adicionado: " + p.getNome());
           return;
       }
       produtos.add(p);
   }


    public double calcularTotal() {
        double total = 0.0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }
}
