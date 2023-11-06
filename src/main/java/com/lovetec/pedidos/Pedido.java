package com.lovetec.pedidos;

import com.lovetec.clientes.Cliente;
import com.lovetec.teclados.Teclado;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private Teclado teclado;

    public Pedido(int numeroPedido, Cliente cliente, Teclado teclado) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.teclado = teclado;
    }

    public void exibirDetalhesPedido() {
        System.out.println("Número do Pedido:" + numeroPedido);
        cliente.exibirInformacoes();
        teclado.exibirInformacoes();
    }
}
