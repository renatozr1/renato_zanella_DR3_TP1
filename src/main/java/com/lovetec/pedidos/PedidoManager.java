package com.lovetec.pedidos;

import com.lovetec.clientes.Cliente;
import com.lovetec.teclados.Teclado;

public class PedidoManager {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria Santos", "maria@email.com");
        Teclado teclado = new Teclado("Wireless KB-456", 79.99);
        Pedido pedido1 = new Pedido(1, cliente, teclado);
        pedido1.exibirDetalhesPedido();
    }
}
