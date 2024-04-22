import java.util.Random;
import java.util.Scanner;

public class Adivinha {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroMaximo = 100;
        int numeroMaximoDeTentativas = 5;
        int numeroSelecionado = new Random().nextInt(numeroMaximo);
        int numeroDeTentativas = 1;
        System.out.println("Jogo de Adivinhação");
        while (numeroDeTentativas <= numeroMaximoDeTentativas) {
            System.out.println("Digite um número entre 0 e " + numeroMaximo + ": ");
            int numero = leitura.nextInt();
            while (numero < 0 || numero > numeroMaximo) {
                System.out.println("Digite um número entre 0 e " + numeroMaximo + ": ");
                numero = leitura.nextInt();
            }
            if (numero == numeroSelecionado) {
                System.out.println("Parabéns! Você acertou o número selecionado.");
                break;
            }
            if (numeroDeTentativas <= numeroMaximoDeTentativas) {
                if (numero < numeroSelecionado) {
                    System.out.println("Dica: o número selecionado é maior do que o número digitado.");
                } else {
                    System.out.println("Dica: o número selecionado é menor do que o número digitado.");
                }
            }
            numeroDeTentativas++;
        }
        if (numeroDeTentativas > numeroMaximoDeTentativas) {
            System.out.println("Número de tentativas finalizadas. O número selecionado foi " + numeroSelecionado);
        }
    }
}
