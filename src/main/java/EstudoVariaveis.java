import java.sql.SQLOutput;

public class EstudoVariaveis {
    // variavel = container de dados
    // java é fortemente tipada, definir o tipo de cada variável
    public static void main(String[] args) {
        // para definir uma variável:
        // <tipo> <nome> = <valor;

        // Tipos primitivos (que nasceram com a linguagem): int, long, char, boolean, double, float
        // Tipos não-primitivos (que adaptaram com o tempo): String, List...

        // Como declarar variaveis?

        int estoque = 150; // até 2 bilhões

        // L = sufixo para representar long
        long populacaoTerra = 7900000000L;

        double salarioDev = 5500.99; // até 15 casas de precisão, double - dupla precisão

        float nota = 7.5F; // até 7 casas de precisão, F -> sufixo para representar float

        boolean ativo = true; // true, false

        String nome = "Felipe Laudano"; // usa-se aspas duplas sempre, cadeia de caracteres

        char letra = 'A';

        // Tipagem forte
        int a = 1000;
        a = 2000; // reatribuição/atualização
        //a = "batata"; -> isso não é possível no java, diferente do JS

        System.out.println("Estoque: " + estoque);
        System.out.println("População da terra: " + populacaoTerra);
        System.out.println(nome);
    }
}
