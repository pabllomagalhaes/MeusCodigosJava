public class CalculadoraDescontos {
    public static void main(String[] args) {
        double precoOriginal = 150.00;
        double percentualDesconto = 0.10; //10% 
        String tipoProduto = "Livro";  
        double valorDesconto = precoOriginal * percentualDesconto;
        double precoComDesconto = precoOriginal - valorDesconto;

        if (tipoProduto.equals("Livro")){ //Verifica se é um Livro para aplicar o desconto extra.
            double descontoExtra = precoComDesconto * 0.05; //Aplica 5% em cima do valor já descontado.
            precoComDesconto = precoComDesconto - descontoExtra;
        }
        System.out.println("Preço inicial: R$" + precoOriginal); //mostra o preço original.
    System.out.println("Valor do Desconto Aplicado: " + percentualDesconto * 100 +"%"); //mostra o valor do desconto.
    System.out.println("Preço final: R$" + precoComDesconto); //mostra o preço com o desconto.
    }
}