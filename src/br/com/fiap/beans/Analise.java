package br.com.fiap.beans;

public abstract class Analise {

    private Usuario usuario;
    private CarroCombustao carroCombustao;
    private CarroEletrico carroEletrico;

    public Analise() {
        super();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CarroCombustao getCarroCombustao() {
        return carroCombustao;
    }

    public void setCarroCombustao(CarroCombustao carroCombustao) {
        this.carroCombustao = carroCombustao;
    }

    public CarroEletrico getCarroEletrico() {
        return carroEletrico;
    }

    public void setCarroEletrico(CarroEletrico carroEletrico) {
        this.carroEletrico = carroEletrico;
    }

    @Override
    public String toString() {
        return "Analise{" +
                "\nusuario=" + usuario +
                "\ncarroCombustao=" + carroCombustao +
                "\ncarroEletrico=" + carroEletrico +
                '}';
    }

}
