import java.util.Scanner;

public class Programa6 {
    public static int lerInteiro(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in).nextInt();
    }

    public static int calcularFatorial(int valor) {
        int i = 1;
        int fat = 1;
        while (i <= valor) {
            fat *= i;
            i++;
        }
        return fat;
    }
    public static void imprimirMensagem(int numero, int valor) {
        System.out.println(String.format("O fatorial de %d é %d.", numero, valor));
    }
    public static void main(String[] args) {
        int numero = lerInteiro("Digite um número: ");
        imprimirMensagem(numero, calcularFatorial(numero));
    }
}
