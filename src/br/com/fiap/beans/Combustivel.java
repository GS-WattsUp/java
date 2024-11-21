package br.com.fiap.beans;

public class Combustivel {

    private String nome;
    private double constanteEmissaoCO2;
    private double preco;

    public Combustivel() {
        super();
    }

    public Combustivel(String nome, double constanteEmissaoCO2, double preco) {
        super();

        this.nome = nome;
        this.constanteEmissaoCO2 = constanteEmissaoCO2;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConstanteEmissaoCO2() {
        return constanteEmissaoCO2;
    }

    public void setConstanteEmissaoCO2(double constanteEmissaoCO2) {
        this.constanteEmissaoCO2 = constanteEmissaoCO2;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Combustivel{" +
                "\nnome='" + nome + '\'' +
                "\nconstanteEmissaoCO2=" + constanteEmissaoCO2 +
                "\npreco=" + preco +
                '}';
    }

}
