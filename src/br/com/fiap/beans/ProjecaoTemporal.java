package br.com.fiap.beans;

public class ProjecaoTemporal extends Analise {

    private String intervalo;
    private double distanciaPorIntervalo;
    private int quantidadeIntervalo;

    public ProjecaoTemporal() {
        super();
    }

    public ProjecaoTemporal(String intervalo, double distanciaPorIntervalo, int quantidadeIntervalo) {
        super();

        this.intervalo = intervalo;
        this.distanciaPorIntervalo = distanciaPorIntervalo;
        this.quantidadeIntervalo = quantidadeIntervalo;
    }

    public String getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }

    public double getDistanciaPorIntervalo() {
        return distanciaPorIntervalo;
    }

    public void setDistanciaPorIntervalo(double distanciaPorIntervalo) {
        this.distanciaPorIntervalo = distanciaPorIntervalo;
    }

    public int getQuantidadeIntervalo() {
        return quantidadeIntervalo;
    }

    public void setQuantidadeIntervalo(int quantidadeIntervalo) {
        this.quantidadeIntervalo = quantidadeIntervalo;
    }

    @Override
    public String toString() {
        return "ProjecaoTemporal{" +
                "\nintervalo='" + intervalo + '\'' +
                "\ndistanciaPorIntervalo=" + distanciaPorIntervalo +
                "\nquantidadeIntervalo=" + quantidadeIntervalo +
                "} " + super.toString();
    }

    // Metodo Operacional Abstrato para calcular a emissão de CO₂ do Carro a Combustão
    // Usa uma distância variável dependendo do tempo decorrido para fazer o cálculo
    public double calculaEmissaoCO2Combustao(int quantidadeIntervalosDecorridos) {
        double distancia = distanciaPorIntervalo * quantidadeIntervalosDecorridos;
        double combustivelGasto = distancia / getCarroCombustao().getConsumo();
        return combustivelGasto * getCarroCombustao().getCombustivel().getConstanteEmissaoCO2();
    }

    // Metodo Operacional Abstrato para calcular a emissão de CO₂ do Carro a Combustão
    // Usa uma distância variável dependendo do tempo decorrido para fazer o cálculo
    public double calculaEmissaoCO2Eletrico(int quantidadeIntervalosDecorridos) {
        double distancia = distanciaPorIntervalo * quantidadeIntervalosDecorridos;
        double energiaGasta = distancia / getCarroEletrico().calculaConsumo();
        return energiaGasta * getCarroEletrico().getConstanteEmissaoCO2();
    }

}
