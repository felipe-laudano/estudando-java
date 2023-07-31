package aula_310723;

public class EstudoMetodos {
    //Um método é um bloco de código que só é executado quando é chamado.

    //Você pode passar dados, conhecidos como parâmetros, para um método.

    //Os métodos são usados para executar determinadas ações e também são conhecidos como funções .

    //Por que usar métodos? Para reutilizar o código: defina o código uma vez e use-o várias vezes.
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    //static significa que o método pertence à classe Main e não um objeto da classe Main.
    //void significa que este método não tem um valor de retorno.

    static void myMethod2(String fname) {
        System.out.println(fname + " Refsnes");
    }
    //As informações podem ser passadas para métodos como parâmetro.
    // Os parâmetros atuam como variáveis dentro do método.
    //Os parâmetros são especificados após o nome do método, entre parênteses.
    // Você pode adicionar quantos parâmetros quiser, basta separá-los com uma vírgula.

    static int myMethod3(int x) {
        return 5 + x;
    }
    // Para um método retornar um valor,
    // pode-se usar um tipo de dado primitivo (como int, char, etc.) em vez de void,
    // e usar a return palavra-chave dentro do método

    static int myMethod4(int x, int y) {
        return x + y;
    }
    //Outro exemplo com retorno

    //Sobrecarga de método:
    //Em vez de definir dois métodos que devem fazer a mesma coisa, é melhor sobrecarregar um.
    //No exemplo abaixo, sobrecarregamos o plusMethod para funcionar para ambos int e double:
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    } //Vários métodos podem ter o mesmo nome,
    // desde que o número e/ou o tipo de parâmetros sejam diferentes.

    public static void main(String[] args) {
        myMethod(); //chamada do método sem argumento

        myMethod2("Felipe"); // chamada do método com parametro
        //Quando um parâmetro é passado para o método, ele é chamado de argumento.
        // Então, do exemplo acima: fname é parametro e
        // Felipe é argumento

        System.out.println(myMethod3(3)); //método com retorno

        System.out.println(myMethod4(5, 3)); // Outro exemplo com retorno

        //também pode armazenar o resultado em uma variável
        // (recomendado, pois é mais fácil de ler e manter):
        int z = myMethod4(6, 3);
        System.out.println(z);

        //chamando o método sobrecarregado com dois tipos primitivos:
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
