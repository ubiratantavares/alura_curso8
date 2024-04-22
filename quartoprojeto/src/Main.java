import java.util.Scanner;

public class Main {

    public static Conta Pesquisar(Operacao operacao, Conta[] contas) {
        operacao.imprimirMensagem("Digite o número da conta do cliente: ");
        int numero = operacao.lerInteiro();
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getNumero() == numero) {
                return contas[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Operacao operacao = new Operacao();

        Conta conta1 = operacao.criarConta(1, "João", 1500.00, "Corrente");
        Conta conta2 = operacao.criarConta(2, "Maria", 600.00, "Poupança");
        Conta conta3 = operacao.criarConta(3, "José", 100.00, "corrente");

        Conta[] contas = {conta1, conta2, conta3};

        Conta conta = Pesquisar(operacao, contas);

        if (conta != null) {
            int opcao = 0;
            while (opcao != 5) {
                operacao.exibirMenu();
                opcao = operacao.lerInteiro();
                switch (opcao) {
                    case 1: {
                        operacao.exibirConta(conta);
                        break;
                    }
                    case 2: {
                        operacao.imprimirMensagem("Digite o valor para saque: ");
                        double valor = operacao.lerDouble();
                        operacao.sacarValorDeConta(conta, valor);
                        break;
                    }
                    case 3: {
                        operacao.imprimirMensagem("Digite o valor para depósito: ");
                        double valor = operacao.lerDouble();
                        operacao.depositarValorEmConta(conta, valor);
                        break;
                    }
                    case 4: {
                        Conta contaTransferencia = Pesquisar(operacao, contas);
                        if (conta != null) {
                            operacao.imprimirMensagem("Digite o valor para transferência: ");
                            double valor = operacao.lerDouble();
                            operacao.transferirValorDeConta(conta, contaTransferencia, valor);
                        } else {
                            operacao.imprimirMensagem("Conta não encontrada!");
                        }
                        break;
                    }
                    case 5: {
                        operacao.imprimirMensagem("Operação finalizada!");
                        break;
                    }
                    default: {
                        System.out.println("Opção Inválida!");
                    }
                }
            }
        } else {
            operacao.imprimirMensagem("Conta não encontrada!");
        }
    }
}
