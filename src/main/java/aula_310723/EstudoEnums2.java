package aula_310723;

enum NivelAcesso {
    ADM, COMUM, USER
}
class Pessoa {
    String nome;
    int idade;
    NivelAcesso nivelAcesso;

    public Pessoa(String nome, int idade, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.idade = idade;
        this.nivelAcesso = nivelAcesso;
    }
}

public class EstudoEnums2 {
    public static void main(String[] args) {
        Pessoa davi = new Pessoa("Davi", 8, NivelAcesso.USER);

        if(davi.nivelAcesso == NivelAcesso.ADM) {
            System.out.println("Libera tudo");
        } else if (davi.nivelAcesso == NivelAcesso.COMUM) {
            System.out.println("Libera somente area privada");
        } else if (davi.nivelAcesso == NivelAcesso.USER) { // bom tratar assim ao inves de só o else, pois pode ser que a pessoa não possua nenhum nivel de acesso
            System.out.println("Libera somente area de usuário");
        }
        else {
            System.out.println("Usuário sem nivel de acesso");
        }
    }
}
