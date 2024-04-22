import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // solicita ao usuário digitar um número
        System.out.println("Digite um número: ");
        int  numero = leitura.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }
    }
}
