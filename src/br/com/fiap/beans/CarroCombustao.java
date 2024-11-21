package br.com.fiap.beans;

public class CarroCombustao extends Carro {

    private Combustivel combustivel;
    private double consumo;
    private String motor;

    public CarroCombustao() {
        super();
    }

    // Metodo de Sobrecarga
    public CarroCombustao(String nome, double preco, String modelo, int ano, double consumo, String motor) {
        super(nome, preco, modelo, ano);

        this.consumo = consumo;
        this.motor = motor;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    // Metodo de Sobrescrita
    @Override
    public String toString() {
        return "CarroCombustao{" +
                "\ncombustivel=" + combustivel +
                "\nconsumo=" + consumo +
                "\nmotor='" + motor + '\'' +
                "} " + super.toString();
    }

}
