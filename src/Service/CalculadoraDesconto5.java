package Service;

import Model.ProdutoModel;

public class CalculadoraDesconto5 implements CalculadoraDesconto {
    @Override
    public Double CalcularDesconto(ProdutoModel produto) {
        Double preco = produto.getPreco();

        if (preco >= 500.00)
            return preco * 0.05;

        return preco;
    }
}
