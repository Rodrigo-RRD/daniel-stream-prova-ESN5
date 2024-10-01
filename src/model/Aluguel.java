package model;

import java.util.Date;

public class Aluguel {

    private String nome;

    private String tipoVeiculo;

    private Double valor;

    private Date data;

    public Aluguel(String nome, String tipoVeiculo, Double valor, Date data) {
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
        this.valor = valor;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setDataString(Date data) {
        this.data = data;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
