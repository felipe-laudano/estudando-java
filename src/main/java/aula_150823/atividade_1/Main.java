package aula_150823.atividade_1;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("GM", "Zafira", Year.of(2005), false, 4);
        Veiculo moto1 = new Moto("Honda", "Titan", Year.of(2021), "Sport", 0.5F);

        System.out.println(carro1.getModelo());
        System.out.println(moto1.getModelo());
    }
}
