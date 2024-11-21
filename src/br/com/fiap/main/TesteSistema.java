package br.com.fiap.main;

import br.com.fiap.beans.*;

import javax.swing.*;

public class TesteSistema {

    static String inputDialogString(String dialogTitle) {
        return JOptionPane.showInputDialog(dialogTitle);
    }

    static int inputDialogInteger(String dialogTitle) {
        String input = JOptionPane.showInputDialog(dialogTitle);
        return Integer.parseInt(input);
    }

    static double inputDialogDouble(String dialogTitle) {
        String input = JOptionPane.showInputDialog(dialogTitle);
        return Double.parseDouble(input);
    }


    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                inputDialogString("Insira o seu Nome"),
                inputDialogString("Insira o seu CPF")
        );

        Endereco endereco = new Endereco(
                inputDialogString("Insira o seu CEP"),
                inputDialogString("Insira o seu País"),
                inputDialogString("Insira o seu Estado"),
                inputDialogString("Insira a sua Cidade"),
                inputDialogString("Insira o seu Bairro"),
                inputDialogString("Insira o seu Logradouro"),
                inputDialogInteger("Insira o Número da sua Residencia"),
                inputDialogString("Insira o Complemento do seu Endereço")
        );

        usuario.setEndereco(endereco);

        CarroCombustao carroCombustao = new CarroCombustao(
                inputDialogString("Insira o Nome do Carro a Combustão"),
                inputDialogDouble("Insira o Preço do Carro a Combustão (R$)"),
                inputDialogString("Insira o Modelo do Carro a Combustão"),
                inputDialogInteger("Insira o Ano do Carro a Combustão"),
                inputDialogDouble("Insira o Consumo do Carro a Combustão (km/L)"),
                inputDialogString("Insira o Motor do Carro a Combustão")
        );

        Combustivel combustivel = new Combustivel(
                inputDialogString("Insira o Nome do Combustível que o Carro a Combustão utiliza"),
                inputDialogDouble("Insira a Constante de Emissão de CO₂ do Combustível que o Carro a Combustão utiliza (kg/L)"),
                inputDialogDouble("Insira o Preço do Litro de Combustível que o Carro a Combustão utiliza (R$)")
        );

        carroCombustao.setCombustivel(combustivel);

        CarroEletrico carroEletrico = new CarroEletrico(
                inputDialogString("Insira o Nome do Carro a Elétrico"),
                inputDialogDouble("Insira o Preço do Carro a Elétrico (R$)"),
                inputDialogString("Insira o Modelo do Carro a Elétrico"),
                inputDialogInteger("Insira o Ano do Carro a Elétrico"),
                inputDialogDouble("Insira a Capacidade da Bateria do Carro a Elétrico (kWh)"),
                inputDialogDouble("Insira a Autonomia da Bateria do Carro a Elétrico (km)"),
                inputDialogDouble("Insira o Preço da Energia (kWh)"),
                inputDialogDouble("Insira a Constante de Emissão de CO₂ da Energia (kg/kWh)")
        );

        AnaliseTrajeto analiseTrajeto = new AnaliseTrajeto(
                inputDialogDouble("Insira a distancia do Trajeto a ser Análisado (km)")
        );

        analiseTrajeto.setUsuario(usuario);
        analiseTrajeto.setCarroCombustao(carroCombustao);
        analiseTrajeto.setCarroEletrico(carroEletrico);

        System.out.println(analiseTrajeto);

        System.out.println("Emissão de CO₂ do Carro a Combustão no Trajeto: " + analiseTrajeto.calculaEmissaoCO2Combustao() + " kg");
        System.out.println("Emissão de CO₂ do Carro Elétrico no Trajeto: " + analiseTrajeto.calculaEmissaoCO2Eletrico() + " kg");

    }

}
