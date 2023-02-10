package Service;

import Model.ProdutoModel;

public class FreteLoggi implements CalculadoraFrete{
    @Override
    public Double CalcularFrete(ProdutoModel produto, Double km) {
        double precoKm = 0.6;

        if (km >= 100.00)
            precoKm = 0.3;
        
        return produto.getPeso() * km * precoKm;
    }
}
