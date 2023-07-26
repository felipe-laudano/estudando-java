import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
//        // Scanner = permite a leitura de dados do teclado
        Scanner entrada = new Scanner(System.in);
//
//        System.out.print("Digite o seu nome: "); // print não quebra linha, \n sim
//        // System.out.println("Oi"); // println quebra a linha
//        String nome = entrada.nextLine(); // Aguarda uma string digitada pelo usuário
//        System.out.println(nome);
//
//        System.out.print("Digite sua altura (em metros): ");
//        double altura = entrada.nextDouble(); // entrada do teclado do tipo double (x,x),
//        // com virgula porque pega o padrão do Brasil, armazena na variavel com ponto
//        System.out.println(altura);
//
//        // Leia o peso da pessoa, calcule o IMC, verifique:
//
//        System.out.println("Digite seu peso em kg: ");
//        double peso = entrada.nextDouble();
//        double imc = peso / Math.pow(altura, 2);
//
//        System.out.println("Seu imc é: " + imc);
//        if (imc < 17) {
//            System.out.println("Muito abaixo do peso");
//        } else if (imc >= 17 && imc < 18.5) {
//            System.out.println("Abaixo do peso");
//        } else if (imc >= 18.5 && imc < 25) {
//            System.out.println("Peso normal");
//        } else if (imc >= 25 && imc < 30) {
//            System.out.println("Acima do peso");
//        } else if (imc >= 30 && imc < 35) {
//            System.out.println("Obesidade I");
//        } else if (imc >= 35 && imc < 40) {
//            System.out.println("Obesidade II (severa)");
//        }
//        else {
//            System.out.println("Obesidade III (mórbida)");
//        }
//
//        System.out.println("Selecione uma dieta (1 a 3)");
//        System.out.println("1 - Água");
//        System.out.println("2 - Fruta");
//        System.out.println("3 - Batata");
//
//        int opcao = entrada.nextInt();
//
//        switch (opcao) {
//            case 1:
//                System.out.println("Você escolheu a dieta da água");
//                break;
//            case 2:
//                System.out.println("Você escolheu a dieta da fruta");
//                break;
//            case 3:
//                System.out.println("Você escolheu a dieta da batata");
//                break;
//            default:
//                System.out.println("Digite um número válido, entre 1 e 3");
//                break;
//        }

//        System.out.println("Digite sua idade: ");
//        int idade = entrada.nextInt();
//
//        String mensagem = idade >= 18 ? "Você é maior de idade" : "Você é menor de idade";
//        System.out.println(mensagem);

        System.out.println("Digite quantos alimentos você come: ");
        int total = entrada.nextInt();

//        for(int i = 0; i < total; i++) {
//            System.out.println("Você gosta de batata");
//        }

        // Exercicio, criar um while com o código acima

        int i = 0;
        while(i < total) {
            System.out.println("Você gosta de pera");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Você gosta de uva");
            j++;
        } while (j < total);

    }
}
