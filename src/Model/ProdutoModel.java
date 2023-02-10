package Model;

public class ProdutoModel {

    private final Double preco;

    private final Integer quantidade;
    private final Double peso;

    public ProdutoModel(Double preco, Integer quantidade, Double peso) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPeso() {
        return peso;
    }
}

