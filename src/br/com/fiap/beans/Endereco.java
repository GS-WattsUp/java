package br.com.fiap.beans;

public class Endereco {

    private String cep;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private int numeroResidencia;
    private String complemento;

    public Endereco() {
        super();
    }

    public Endereco(String cep, String pais, String estado, String cidade, String bairro, String logradouro, int numeroResidencia, String complemento) {
        super();

        this.cep = cep;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numeroResidencia = numeroResidencia;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "\ncep='" + cep + '\'' +
                "\npais='" + pais + '\'' +
                "\nestado='" + estado + '\'' +
                "\ncidade='" + cidade + '\'' +
                "\nbairro='" + bairro + '\'' +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumeroResidencia=" + numeroResidencia +
                "\ncomplemento='" + complemento + '\'' +
                '}';
    }

}
