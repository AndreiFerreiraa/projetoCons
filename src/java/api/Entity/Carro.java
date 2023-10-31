package api.Entity;

import java.util.UUID;

public class Carro {
    private final UUID id;
    private final String modelo;
    private final String renavan;
    private final String cor;
    private final int ano;
    private final double preco;
    private final String photo;
    private final boolean vendido;

    public Carro(String modelo, String renavan, String cor, int ano, double preco, String photo, boolean vendido) {
        this.id = UUID.randomUUID();
        this.modelo = modelo;
        this.renavan = renavan;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.photo = photo;
        this.vendido = vendido;
    }

    public UUID getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getRenavan() {
        return renavan;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public String getPhoto() {
        return photo;
    }

    public boolean isVendido() {
        return vendido;
    }
       
}
    