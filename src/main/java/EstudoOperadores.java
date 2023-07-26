public class EstudoOperadores {
    public static void main(String[] args) {
        // Operadores matemáticos
        int a = 10;
        int b = 15;
        int soma = a + b;
        int subtr = a - b;
        int multi = a * b;
        double div = b / a; // divisão entre dois inteiros => inteiro

        System.out.println("Números: " + a + ", " + b
                            + "\nSoma: " + soma
                            + "\nSubtração: " + subtr
                            + "\nMultiplicação: " + multi
                            + "\nDivisão: " + div);
        // Divisão do jeito adequado
        int c = 10;
        double d = 15.0;
        double div2 = d / c;
        // divisão entre double e int => double
        System.out.println("Divisão com double: " + div2);

        //Math
        double x = Math.pow(2, 3);
        double y = Math.sqrt(144);
        System.out.println(Math.PI);

        //Incremento/Decremento
        int valor = 5;
        valor++; // valor = valor + 1
        valor--; // valor = valor - 1
        ++valor;
        --valor;
        valor += 10; // valor = valor + 10

        // Operadores relacionais (>, <, >=, <=, ==, !=)
        boolean teste1 = 10 > 5; // true
        boolean teste2 = 5 < 1; // false
        boolean teste3 = 5 == 5; // true
        boolean teste4 = 4 != 5; // true
        boolean teste5 = 5 >= 5; // true

        // Operadores lógicos (&&, ||, !)
        boolean teste7 = true && false; // false
        boolean teste8 = true || false; // true
        boolean teste9 = (5 > 10) && (8 > 4); // false
        boolean teste10 = (10 >= 0) || (1 < 5); // true
        boolean teste11 = !teste1; // negando o true = false
        System.out.println(teste11);

        // Exercicio 1
        // Crie duas variaveis: peso e altura e calcule o IMC
        double peso = 75.5;
        double altura = 1.82;
        double imc = peso / Math.pow(altura, 2);
        System.out.println("O IMC com peso " + peso + " e altura " + altura + " é: " + imc);
    }
}
