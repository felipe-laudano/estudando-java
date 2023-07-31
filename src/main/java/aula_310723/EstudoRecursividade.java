package aula_310723;

public class EstudoRecursividade {
    public static void main(String[] args) {
        int result = sum(10);


        //10 + soma(9)
        //10 + ( 9 + soma(8) )
        //10 + ( 9 + ( 8 + soma(7) ) )
        //...
        //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + soma(0)
        //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            //Quando a sum()função é chamada, ela adiciona o parâmetro k à soma de todos os números
            // menores que k e retorna o resultado.

            return k + sum(k - 1);
        } else {
            return 0; // Quando k se torna 0, a função retorna apenas 0.
            // Como a função não chama a si mesma quando k é 0,
            // o programa para aí e retorna o resultado.
        }
    } // Ao executar, o programa segue os seguintes passos:
        //10 + soma(9)
        //10 + ( 9 + soma(8) )
        //10 + ( 9 + ( 8 + soma(7) ) )
        //...
        //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + soma(0)
        //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

//Assim como os loops podem se deparar com o problema do loop infinito,
// as funções recursivas podem se deparar com o problema da recursão infinita.
// Recursão infinita é quando a função nunca para de chamar a si mesma.
// Toda função recursiva deve ter uma condição de parada,
// que é a condição em que a função para de chamar a si mesma.
// No exemplo anterior, a condição de parada é quando o parâmetro k se torna 0.

// Neste exemplo, a função adiciona um intervalo de números entre um início e um fim.
// A condição de parada para esta função recursiva é quando o fim não é maior que o início:
}