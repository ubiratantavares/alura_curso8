import java.util.Scanner;

public class Programa4 {

    public static int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in).nextInt();
    }

    public static void calcularTabuada(int valor) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + valor + " = " + (i * valor));
        }
    }
    public static void main(String[] args) {
        int tabuada = lerInteiro("Digite o número da tabuada: ");
        calcularTabuada(tabuada);
    }
}
