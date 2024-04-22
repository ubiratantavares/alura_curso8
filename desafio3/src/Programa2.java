import java.util.Scanner;

public class Programa2 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // solicita ao usuário digitar dois números inteiros
        System.out.println("Digite o primeiro número: ");
        int numero1 = leitura.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 < numero2) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("O primeiro número é maior.");
        }
    }
}
