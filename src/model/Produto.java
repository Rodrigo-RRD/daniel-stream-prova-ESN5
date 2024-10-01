package model;

public class Produto {

    private String nome;
    private int estoque;
    private Double valor;

    public Produto(String nome, int estoque, Double valor) {
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
