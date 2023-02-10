package Service;

import Model.ProdutoModel;

public class CalculadoraDescontoProgressivo implements CalculadoraDesconto {
    @Override
    public Double CalcularDesconto(ProdutoModel produto) {
        Integer quantidade = produto.getQuantidade();
        Double preco = produto.getPreco();

        if (quantidade >= 2 && quantidade <= 5)
            return preco * 0.1;

        else if (quantidade > 10) {
            return preco * 0.15;
        }
        return preco;
    }
}
