package aula_280723;

import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {

        //Crie um programa que recebe um email e uma senha do usuário.
        // Valide se o email é do domínio @soulcode.com e
        // a senha tem comprimento maior que 8.
        // Exiba uma mensagem caso email e senha não sejam válidos.

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Insira seu email: ");
//        String email = scanner.nextLine();
//        System.out.print("\nDigite sua senha: ");
//        String senha = scanner.nextLine();
//
//        if(email.contains("@soulcode.com") && senha.length() > 8) {
//            System.out.printf("\nBem vindo(a) %s", email);
//        }
//        else {
//            System.out.println("email e/ou senha invalido(s)");
//        }
//
//
//


        //Crie um programa que define 2 vetores de tamanho igual.
        // Em seguida, crie um terceiro vetor
        // de mesmo tamanho onde o valor em cada posição do terceiro é
        // resultado da soma dos valores nos vetores 1 e 2 na mesma posição.

        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {2, 3, 4};
        int[] vetor3 = new int[3];

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.print("vetor3 = ");
        for(int elemento : vetor3) {
            System.out.print(elemento + ", ");
        }
    }
}
