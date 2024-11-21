package br.com.fiap.beans;

public abstract class Carro {

    private String nome;
    private double preco;
    private String modelo;
    private int ano;

    public Carro() {
        super();
    }

    public Carro(String nome, double preco, String modelo, int ano) {
        super();

        this.nome = nome;
        this.preco = preco;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "\nnome='" + nome + '\'' +
                "\npreco=" + preco +
                "\nmodelo='" + modelo + '\'' +
                "\nano=" + ano +
                '}';
    }

}
