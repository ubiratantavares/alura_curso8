import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int quantidade = 3;
        double media = 0.0;
        double nota = 0.0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a avaliação para o filme: ");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Media das avaliações: " + (media / quantidade));

        leitura.close();
    }
}
