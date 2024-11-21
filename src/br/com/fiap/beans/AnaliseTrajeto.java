package br.com.fiap.beans;

public class AnaliseTrajeto extends Analise {

    private double distancia;

    public AnaliseTrajeto() {
        super();
    }

    public AnaliseTrajeto(double distancia) {
        super();

        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "AnaliseTrajeto{" +
                "\ndistancia=" + distancia +
                "} " + super.toString();
    }

    // Metodo Operacional Abstrato para calcular a emissão de CO₂ do Carro a Combustão
    // Usa a distância fixa definida na instanciação da classe para fazer o cálculo
    public double calculaEmissaoCO2Combustao() {
        double combustivelGasto = distancia / getCarroCombustao().getConsumo();
        return combustivelGasto * getCarroCombustao().getCombustivel().getConstanteEmissaoCO2();
    }

    // Metodo Operacional Abstrato para calcular a emissão de CO₂ do Carro Elétrico
    // Usa a distância fixa definida na instanciação da classe para fazer o cálculo
    public double calculaEmissaoCO2Eletrico() {
        double energiaGasta = distancia / getCarroEletrico().calculaConsumo();
        return energiaGasta * getCarroEletrico().getConstanteEmissaoCO2();
    }

}
