package br.com.fiap.beans;

public class CarroEletrico extends Carro {

    private double capacidadeBateria;
    private double autonomiaBateria;
    private double precoEnergia;
    private double constanteEmissaoCO2;

    public CarroEletrico() {
        super();
    }

    public CarroEletrico(String nome, double preco, String modelo, int ano, double capacidadeBateria, double autonomiaBateria, double precoEnergia, double constanteEmissaoCO2) {
        super(nome, preco, modelo, ano);
        this.capacidadeBateria = capacidadeBateria;
        this.autonomiaBateria = autonomiaBateria;
        this.precoEnergia = precoEnergia;
        this.constanteEmissaoCO2 = constanteEmissaoCO2;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(double capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public double getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(double autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public double getPrecoEnergia() {
        return precoEnergia;
    }

    public void setPrecoEnergia(double precoEnergia) {
        this.precoEnergia = precoEnergia;
    }

    public double getConstanteEmissaoCO2() {
        return constanteEmissaoCO2;
    }

    public void setConstanteEmissaoCO2(double constanteEmissaoCO2) {
        this.constanteEmissaoCO2 = constanteEmissaoCO2;
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "\ncapacidadeBateria=" + capacidadeBateria +
                "\nautonomiaBateria=" + autonomiaBateria +
                "\nprecoEnergia=" + precoEnergia +
                "\nconstanteEmissaoCO2=" + constanteEmissaoCO2 +
                "} " + super.toString();
    }

    // Metodo Operacional, que calcula o consumo do carro elétrico por km
    public double calculaConsumo() {
        return autonomiaBateria / capacidadeBateria;
    }

}
