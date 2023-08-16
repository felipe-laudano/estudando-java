package aula_150823.atividade_4;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Desenvolvedor("Felipe", "Senior", "65465465498");
        Funcionario func2 = new Atendente("Jonas", "Analista", "32132132165");
        Funcionario func3 = new Gerente("Felipão", "Gerente", "65498798787");

        System.out.println(func1.cargo);
        System.out.println(func2.cpf);
        System.out.println(func3.nome);

    }
}
