import Model.ProdutoModel;
import Service.*;

public class MeuApp {
    public static void main(String[] args) {
        FreteSedex calculadoraDeFreteSedex = new FreteSedex();
        FreteLoggi calculadoraDeFreteLoggi = new FreteLoggi();
        FreteParceiros calculadoraDeFreteParceiros = new FreteParceiros();

        CalculadoraDePreco calculoDePrecoUsandoSedex = new CalculadoraDePreco(calculadoraDeFreteSedex, new CalculadoraDescontoProgressivo());
        CalculadoraDePreco calculoDePrecoUsandoLoggi = new CalculadoraDePreco(calculadoraDeFreteLoggi, new CalculadoraDesconto5());
        CalculadoraDePreco calculoDePrecoUsandoParceiros = new CalculadoraDePreco(calculadoraDeFreteParceiros, new CalculadoraDescontoBlackFriday());

        ProdutoModel produto = new ProdutoModel(100.0, 2,10.00);
        Double km = 10.00;

        System.out.println("Preço do Produto com o Sedex");
        System.out.println(calculoDePrecoUsandoSedex.calcular(produto, km));

        System.out.println("Preco do Produto com a Loggi");
        System.out.println(calculoDePrecoUsandoLoggi.calcular(produto, km));

        System.out.println("Preco do Produto com os Parceiros");
        System.out.println(calculoDePrecoUsandoParceiros.calcular(produto, km));

    }
}