package aula_150823.atividade_4;

public abstract class Funcionario {
    String nome;
    public String cargo;
    public String cpf;

    public Funcionario(String nome, String cargo, String cpf) {
        this.cargo = cargo;
        this.cpf = cpf;
    }

}
