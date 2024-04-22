public class Main {

    public static void main(String[] args) {

        // realiza a media de duas notas decimais e exibe o resultado
        double nota1 = 8.5;
        double nota2 = 6.5;
        double mediasNotas = (nota1 + nota2) / 2;
        System.out.println(mediasNotas);

        // declara uma variavel do tipo double e uma variavel do tipo int
        double notaFinal = 8.8;
        int notaFinalInteira = (int) notaFinal;
        System.out.println(notaFinalInteira);

        // declara uma variavel do tipo char e uma variavel do tipo String
        char letra = 'a';
        String palavra = "mar";
        System.out.println(letra + palavra);

        // declara uma variavel do tipo double precoProduto e uma variavel do tipo int quantidade
        double precoProduto = 9.99;
        int quantidade = 100;
        // calcula o valor total
        double total = precoProduto * quantidade;
        System.out.println(total);

        // declara uma variavel do tipo double valorEmDolares
        double valorEmDolares = 1000.0;

        // converta o valor em dolares para valor em reais
        double valorEmReais = 4.94 * valorEmDolares;

        System.out.println(valorEmReais);

        // declara uma variavel do tipo double precoOriginal
        double precoOriginal = 1000.0;

        // declara uma variavel do tipo double percentualDesconto
        double percentualDesconto = 0.1;

        // calcula o valor de desconto
        double valorDeDesconto = percentualDesconto * precoOriginal;

        double precoComDesconto = precoOriginal - valorDeDesconto;

        System.out.println(precoComDesconto);
    }
}
