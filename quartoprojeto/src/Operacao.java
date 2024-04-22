import java.util.Scanner;

public class Operacao {

    // inicializar dados do cliente
    public Conta criarConta(int numero, String nome, double saldo, String tipo) {
        return new Conta(numero, new Cliente(nome), saldo, tipo);
    }

    // menu de opcoes
    public void exibirMenu() {
        String menu = """
                1. Consultar saldo
                2. Sacar valor
                3. Depositar valor
                4. Transferir valor
                5. Sair                
                Digite sua opção:""";
        System.out.println(menu);
    }

    public void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public int lerInteiro() {
        return new Scanner(System.in).nextInt();
    }

    public double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public String lerString() {
        return new Scanner(System.in).nextLine();
    }

    public void exibirConta(Conta conta) {
        System.out.println("===========================");
        System.out.println(conta);
        System.out.println("\n===========================");
    }

    // Saca valor da conta do cliente
    public void sacarValorDeConta(Conta conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println(String.format("Saque de %.2f reais realizado com sucesso.", valor));
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    // Deposita valor na conta do cliente
    public void depositarValorEmConta(Conta conta, double valor) {
        if (conta.depositar(valor)) {
            System.out.println(String.format("Deposito de %.2f reais realizado com sucesso.", valor));
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

    // Tranfere valor da conta de um cliente para a conta de outro cliente
    public void transferirValorDeConta(Conta conta, Conta outraConta, double valor) {
        if (conta.transferir(outraConta, valor)) {
            System.out.println(String.format("Transferência de %.2f reais realizado com sucesso.", valor));
        } else {
            System.out.println("Não foi possívelk realizar a transferência.");
        }
    }
}
