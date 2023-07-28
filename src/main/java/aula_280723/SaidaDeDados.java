package aula_280723;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Hello world"); // quebra linha
        System.out.print(1); // não quebra linha
        System.out.print(2);
        System.out.println("\ttab \npula linha");
//        System.err.println("Impressão de erro"); // imprime vermelho

        int n1 = 7;
        int n2 = 9;
        int soma = n1 + n2;
        System.out.printf("A soma de %d e %d é %d", n1, n2, soma);
        // %d mapeia um número
        // %s mapeia um texto
        // %f mapeia numero flutuante

        String nome = "Felipe";
        System.out.printf("\nBem vindo %s", nome);

        double num1 = 3.5;
        double num2 = 12.5;
        double div = num2 / num1;
        System.out.printf("A divisão de %.2f por %.2f é %.2f", num2, num1, div); //.2 para determinar qtd de casas decimais
    }
}