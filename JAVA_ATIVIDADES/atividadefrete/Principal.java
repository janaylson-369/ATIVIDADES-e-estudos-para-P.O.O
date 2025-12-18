package atividadefrete;

public class Principal {
    public static void main(String[] args) {
        
        CadastroFrete c = new CadastroFrete();

        // Frete Padrão: km=100, valorporkm=10
        c.cadastroDeFretes(new FretePadrao(100, 10));

        // Frete Expresso: km=110, valorporkm=10, nivelurgencia=2
        c.cadastroDeFretes(new FreteExpresso(110, 10, 2));

        // Frete Super Expresso: km=120, valorporkm=10, valordoseguro=2, nivelurgencia=3
        c.cadastroDeFretes(new FreteSuperExpresso(120, 10, 2, 3));

        // A chamada c.calcularTotal() faria o cálculo total de todos os fretes.
        c.imprimirfretes();
    }

}
