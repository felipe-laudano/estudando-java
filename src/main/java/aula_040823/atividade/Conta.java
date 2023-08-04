package aula_040823.atividade;

//Classe Conta: Atributos: número da conta, saldo e cliente
// (representado por um objeto da classe Cliente). Métodos: getters e setters para os atributos,
// além de um método depositar(double valor) que adiciona o valor ao saldo da conta,
// e um método sacar(double valor) que realiza um saque, desde que o saldo seja suficiente.
public class Conta {
    private Integer numero;
    private Double saldo;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(Integer numero, Double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(Double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
        }
        else {
            System.out.println("Insira um valor positivo");
        }
    }

    public void sacar(Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "numero: " + numero + " saldo: " + saldo + " cliente:" + cliente;
    }
}
