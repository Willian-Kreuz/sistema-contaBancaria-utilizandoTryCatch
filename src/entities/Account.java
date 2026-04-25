package entities;

import exceptions.ExcecaoDeDominio;

public class Account {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Account() {
    }

    public Account(Integer numero, Double saldo, String titular, Double limiteDeSaque) {
        // Validações de entrada
        if (numero == null) {
            throw new ExcecaoDeDominio("Número da conta é obrigatório.");
        }

        // Validações de negócio
        if (numero <= 0) {
            throw new ExcecaoDeDominio("Número da conta deve ser positivo.");
        }
        if (saldo < 0) {
            throw new ExcecaoDeDominio("Saldo inicial não pode ser negativo.");
        }
        if (limiteDeSaque < 0) {
            throw new ExcecaoDeDominio("Limite de saque não pode ser negativo.");
        }
        if (titular == null || titular.trim().isEmpty()) {
            throw new ExcecaoDeDominio("Titular não pode ser vazio.");
        }
        if (titular.matches(".*\\d.*")) {
            throw new ExcecaoDeDominio("Titular não pode conter números.");
        }

        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(Double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    public void deposito(Double valor) {
        saldo += valor;
    }

    public void saque(Double valor) {
        validarValor(valor);
        saldo -= valor;
    }

    private void validarValor(double valor) {
        if (valor > getLimiteDeSaque()) {
            throw new ExcecaoDeDominio("Valor do saque excede o seu limite de saque.");
        }
        if (valor > getSaldo()) {
            throw new ExcecaoDeDominio("Saldo insuficiente para realizar o saque.");
        }
    }
}

