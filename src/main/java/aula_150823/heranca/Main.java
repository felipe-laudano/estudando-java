package aula_150823.heranca;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Produto batata = new Produto("Batata", 8.5F, "1108");
        System.out.println(batata.getCodigo());
        System.out.println(batata.getNome());

        Livro unicaCoisa = new Livro("A única coisa", 99.9F, "123456", 120, "1245.654.55");
        System.out.println(unicaCoisa.getPreco());

        Comida comida = new Comida("Tapioca", 5.0F, "42656", LocalDate.of(2023, 9, 30), 100.0F);
        System.out.println(comida.getNome());

        Carne contrafile = new Carne("Contra filé", 50.0F, "1058", LocalDate.of(2023, 9, 5), 200.0F, "Bovina");
        System.out.println(contrafile.getNome());
        System.out.println(contrafile.getCategoria());
        System.out.println(contrafile.getCaloria());
    }
}
