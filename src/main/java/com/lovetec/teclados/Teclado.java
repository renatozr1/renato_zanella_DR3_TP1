package com.lovetec.teclados;

public class Teclado {
    private String modelo;
    private double preco;

    public Teclado(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$" + preco);
    }
}
