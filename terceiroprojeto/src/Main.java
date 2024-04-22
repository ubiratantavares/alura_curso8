import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação");
        }

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o Ano de nascimento: ");
        anoDeLancamento = leitura.nextInt();

        System.out.println("Digite a avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme + ", " + anoDeLancamento + ", " + avaliacao);


        leitura.close();
    }
}
