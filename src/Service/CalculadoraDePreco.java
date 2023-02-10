package Service;

import Model.ProdutoModel;

public class CalculadoraDePreco {
    private final CalculadoraFrete calculadoraFrete;
    private CalculadoraDesconto calculadoraDesconto;

    public CalculadoraDePreco(CalculadoraFrete calculadoraFrete, CalculadoraDesconto calculadoraDesconto) {
        this.calculadoraFrete = calculadoraFrete;
        this.calculadoraDesconto = calculadoraDesconto;
    }

    public Double calcular(ProdutoModel produto, Double km) {
        Double frete = calculadoraFrete.CalcularFrete(produto, km);
        Double desconto = calculadoraDesconto.CalcularDesconto(produto);
        return produto.getPreco() + frete - desconto;
    }

}
