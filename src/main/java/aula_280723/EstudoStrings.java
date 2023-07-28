package aula_280723;

import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
//        String java = "Java"; // valor não primitivo - objeto, todo texto é um objeto, começou com maiusculo é uma classe (String)
//        // int num = 2; // primitivo
//        System.out.println(java.toLowerCase()); // transforma em minusculas
//        System.out.println(java.toUpperCase()); // transforma em maiusculas
//        System.out.println(java.charAt(2)); // pega um caractere conforme sua posição
//        System.out.println(java.indexOf("j")); // pega o indice do primeiro caractere na subtring
//        System.out.println(java.replace("v", "C")); // troca v pelo c
//        System.out.println(java.replaceAll("a", "i")); // troca todos a pelo i
//        System.out.println(java.substring(2, 4)); // indice inicial, indice final +1
//        System.out.println(java.length()); // método que calcula o tamanho do texto
//
//        String nome1 = "Felipe";
//        String nome2 = "felipe";
//        System.out.println(nome1 == nome2); // comparação das propriedades dos objetos, não compara o texto (como o hash code)
//        System.out.println(nome1.equals(nome2)); // compara os textos de nome1 e nome2
//        System.out.println(nome1.equalsIgnoreCase(nome2)); // compara os textos de nome1 e nome2.
        Scanner scanner = new Scanner(System.in);
        String texto = "Vamos para o break e retornamos as 10:35";

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if(palavra.isEmpty()) { // isEmpty considera espaço como valor, isBlank não considera os espaços como valor
            System.out.println("Conteudo vazio");
        }
        else if(texto.contains(palavra)) {
            System.out.println("Contém");
        }
        else {
            System.out.println("Não contém");
        }
    }
}

//JIT - Just in time, caracteristica do JAVA, primeiro interpreta o script, gera um class,
// e determina o SO que ele esta trabalhando (IOS, Windows...) e compila.