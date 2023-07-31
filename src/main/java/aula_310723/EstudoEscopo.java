package aula_310723;

public class EstudoEscopo {

    public static void main(String[] args) {

    //Um bloco de código refere-se a todo o código entre chaves {}.
        // Variáveis declaradas dentro de blocos de código só são acessíveis pelo código entre chaves,
        // que segue a linha em que a variável foi declarada:

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

    } // Um bloco de código pode existir sozinho ou pertencer a uma instrução
    // if, while ou for. No caso do for, as variáveis declaradas no próprio comando também estão disponíveis
    // dentro do escopo do bloco for.

}
