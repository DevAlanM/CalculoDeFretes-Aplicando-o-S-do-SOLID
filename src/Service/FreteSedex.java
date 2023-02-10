package Service;

import Model.ProdutoModel;

public class FreteSedex implements CalculadoraFrete {
    @Override
    public Double CalcularFrete(ProdutoModel produto, Double km) {
        return produto.getPeso() * km * 0.5;
    }
}
