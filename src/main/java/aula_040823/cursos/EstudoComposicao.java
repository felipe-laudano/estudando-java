package aula_040823.cursos;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Felipe", "879865");
        Aluno aluno2 = new Aluno("Renato", "879843");
        Aluno aluno3 = new Aluno("Jurandir", "879841");
        List<Aluno> alunos = new ArrayList<>(List.of(aluno1, aluno2, aluno3));

        Professor professor = new Professor("Gabriel", "51846987-8");

        Curso curso = new Curso("Java", 200.0F, professor, alunos);

        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso);
        System.out.println(curso.getAlunos().get(2).getNome()); //acessando o nome do terceiro aluno
    }
}
