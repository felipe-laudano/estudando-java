package aula_040823.atividade;

//Crie um programa em Java que simule um sistema bancário básico.
// O sistema deve ter as seguintes classes: Conta, Cliente e Banco.
//Classe Cliente: Atributos: nome, idade e CPF. Métodos: getters e setters para os atributos.
public class Cliente {
    private String nome;
    private Integer idade;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "{" + nome +
                ", " + idade +
                ", " + cpf +
                "}";
    }
}
