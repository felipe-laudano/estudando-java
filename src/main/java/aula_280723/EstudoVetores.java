package aula_280723;

import java.util.Scanner;

public class EstudoVetores {
    public static void main(String[] args) {
//        // vetores só podem ter um tipo
//        int[] nums = {1, 2, 3, 4, 5}; // vetor de numeros inteiros
//        System.out.println(nums[4]);
//        nums[4] = 8; // alterando valor da posição 4
//        System.out.println(nums[4]);
//
//        double[] notas = new double[60]; // declara um vetor double vazio com 60 posições
//        notas[59] = 5.6;
//        System.out.println(notas[59]);
//        System.out.println(notas[1]);
//
//        //Outra forma
//        String nomes2[] = {"Kaka", "Ronaldo"}; //colchetes depois do nome do vetor, ao invés do lado do tipo
//
//        for(int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]); // iterando sobre o vetor para imprimir todos os elementos
//        }
//
//        System.out.println(); // quebra de linha
//
//        for(int num : nums) {
//            System.out.print(num);
//        }
//        System.out.println(); // quebra de linha
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de notas: "); // determinando o tamanho do vetor,
        int nNotas = scanner.nextInt(); // pela entrada do usuário

        double[] notas = new double[nNotas]; // declarando o vetor com tamanho da entrada do usuário
        for(int i = 0; i < nNotas; i++) {
            System.out.print("\nDigite a nota: ");
            notas[i] = scanner.nextDouble(); // guarda as notas no vetor notas
        }

        double media = 0.0;
        for(double nota : notas) media += nota; // modo sem chaves com ;, aqui a media vai somando os valores das notas
        media /= nNotas; // aqui a media é dividida pelo tamanho do vetor notas que o usuário forneceu
        System.out.printf("\nA média é igual a %f", media);
    }
}
