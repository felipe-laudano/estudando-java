package aula_040823.atividade;

import java.util.ArrayList;
import java.util.List;

//Classe Banco: Atributo: uma lista de contas (deve ser um ArrayList).
//Métodos: criarConta(Cliente cliente), que cria uma nova conta para o cliente informado
// e a adiciona à lista de contas do banco; buscarConta(int numeroConta),
// que retorna a conta correspondente ao número informado; listarContas(),
// que exibe as informações de todas as contas do banco.
public class Banco {

    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void criarConta(Cliente cliente) {
        Conta conta = new Conta(this.contas.size()+1, 0.0, cliente);
        contas.add(conta);
    }

    public Conta buscarConta(Integer numeroConta) {
        for(Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        for(Conta conta : contas) {
            System.out.println(conta);
        }
    }

    @Override
    public String toString() {
        return "{ " + contas + " }";
    }
}
