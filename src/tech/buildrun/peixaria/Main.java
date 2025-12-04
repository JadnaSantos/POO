package tech.buildrun.peixaria;

import java.util.List;

public class Main {

    static void main(String[] args) {

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();


        cliente.setEndereco(endereco);

        Pedido pedido = new Pedido();
        ItemPedido itemPedido = new ItemPedido();
        Produto produto = new Produto();

        itemPedido.setProduto(produto);
        pedido.setCliente(cliente);
        pedido.setItemPedidos(List.of(itemPedido));

    }
}
