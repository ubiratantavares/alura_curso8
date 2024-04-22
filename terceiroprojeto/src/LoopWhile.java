import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int totalDeNotas = 0;
        double media = 0.0;
        double nota = 0.0;

        while (nota != -1) {
            System.out.println("Digite a avaliação para o filme: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }
        if (totalDeNotas != 0) {
            System.out.println("Media das avaliações: " + (media / totalDeNotas));
        } else {
            System.out.println("Media das avaliações: " + media);
        }

        leitura.close();
    }
}
