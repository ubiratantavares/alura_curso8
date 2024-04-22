import java.util.Scanner;

public class Programa3 {

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
    }
    public static int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in).nextInt();
    }

    public static double lerDouble(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in).nextDouble();
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void imprimirMensagem(String mensagem, double valor) {
        System.out.println(mensagem + valor);
    }
    public static void main(String[] args) {

        menu();
        int opcao = lerInteiro("Digite a sua opção: ");

        while (opcao < 1 || opcao > 2) {
            opcao = lerInteiro("Digite a sua opção: ");
        }

        if (opcao == 1) {
            double lado = lerDouble("Digite o lado do quadrado: ");
            double area = calcularAreaQuadrado(lado);
            imprimirMensagem("A área do quadrado = ", area);
        } else {
            double raio = lerDouble("Digite o raio do círculo: ");
            double area = calcularAreaCirculo(raio);
            imprimirMensagem("A área do círculo = ", area);
        }
    }
}
