package Service;

import Model.ProdutoModel;

public class CalculadoraDescontoBlackFriday implements CalculadoraDesconto {
    @Override
    public Double CalcularDesconto(ProdutoModel produto) {
        Integer quantidade = produto.getQuantidade();
        Double preco = produto.getPreco();

        if (quantidade >= 3 && preco > 1000.00 || preco >= 2500.00)
            return preco * 0.4;

        return preco;
    }
}
