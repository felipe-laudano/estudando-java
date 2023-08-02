package aula_010823;

import java.time.LocalDate;
import java.util.*;

//5 - Crie um enum chamado EstacoesDoAno com os valores representando
// as estações do ano (Verão, Outono, Inverno e Primavera).
enum EstacoesDoAno {
    VERAO,
    OUTONO,
    INVERNO,
    PRIMAVERA
}


public class Atividade {

    //2 - Implemente um método que receba uma lista de números e
    // retorne a média aritmética dos elementos presentes na lista.
    public static double mediaLista(List<Integer> lista) {
        int soma = 0;
        for (Integer num : lista) {
            soma += num;
        }
        double media = (double) soma / lista.size();
        return media;
    }

    public static boolean isPrimo(int n) {
        boolean primo = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {

        //1 - Crie um programa que receba 5 números do usuário e armazene-os em uma lista.
        // Em seguida, exiba o maior e o menor número da lista.

        Scanner scanner = new Scanner(System.in);
//        List<Integer> numbers = new ArrayList<Integer>();
//
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("Digite o " + i + "º número: ");
//            int n = scanner.nextInt();
//            numbers.add(n);
//        }
//
//        int min = Collections.min(numbers);
//        int max = Collections.max(numbers);
//
//        System.out.println("Menor número: " + min);
//        System.out.println("Maior número: " + max);


        //2 - Implemente um método que receba uma lista de números e
        // retorne a média aritmética dos elementos presentes na lista.

//        List<Integer> numbers = new ArrayList<Integer>();
//        Collections.addAll(numbers, 1, 2, 3, 4, 5);
//        System.out.println(mediaLista(numbers));

        //3 - Escreva um programa que calcule e exiba a
        // data daqui a três semanas a partir da data atual.

//        LocalDate agora = LocalDate.now();
//        System.out.println(agora.plusWeeks(3));


        //4 - Escreva um método que receba um número inteiro e
        // retorne verdadeiro se ele for primo e falso caso contrário.

//        int n = scanner.nextInt();
//        if(isPrimo(n)) {
//            System.out.println("É primo");
//        }
//        else {
//            System.out.println("Não é primo");
//        }

        //6 - Escreva um programa que receba o mês atual do usuário e
        // informe a estação do ano correspondente.
//        System.out.println("Digite o mês do ano(1-12): ");
//        int mes = scanner.nextInt();
//
//        switch (mes) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println(EstacoesDoAno.VERAO);
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println(EstacoesDoAno.OUTONO);
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println(EstacoesDoAno.INVERNO);
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println(EstacoesDoAno.PRIMAVERA);
//                break;
//        }
    }


}
