package br.com.fiap.beans;

public class Usuario {

    private String nome;
    private String cpf;
    private Endereco Endereco;

    public Usuario() {
        super();
    }

    public Usuario(String nome, String cpf) {
        super();

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public br.com.fiap.beans.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(br.com.fiap.beans.Endereco endereco) {
        Endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\nnome='" + nome + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\nEndereco=" + Endereco +
                '}';
    }

}
