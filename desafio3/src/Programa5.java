import java.util.Scanner;

public class Programa5 {

    public static int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in).nextInt();
    }

    public static boolean ehPar(int valor) {
        if (valor % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int numero = lerInteiro("Digite um número: ");

        if (ehPar(numero)) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}
