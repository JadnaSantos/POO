package tech.buildrun.peixaria;

import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> itemPedidos;


    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
