package Service;

import Model.ProdutoModel;

public interface CalculadoraFrete {
    Double CalcularFrete(ProdutoModel produto, Double km);
}
