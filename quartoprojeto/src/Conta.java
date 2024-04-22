public class Conta {

    private int numero;
    private Cliente cliente;
    private double saldo;
    private String tipo;

    public Conta(int numero, Cliente cliente, double saldo, String tipo) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta outraConta, double valor) {
        if (sacar(valor)) {
            return outraConta.depositar(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Número: %d\nNome do cliente: %s\nSaldo atual: %.2f\nTipo de conta: %s", this.numero,
                this.cliente.getNome(), this.saldo, this.tipo);
    }
}
