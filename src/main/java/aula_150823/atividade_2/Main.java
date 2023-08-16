package aula_150823.atividade_2;

import java.time.LocalDate;

//Implemente um sistema de pagamento com diferentes métodos (CartaoCredito, PayPal, BoletoBancario)
// que possam ser usados de forma polimórfica.
public class Main {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2023, 8, 21);
        LocalDate data2 = LocalDate.of(2023, 12, 5);
        LocalDate data3 = LocalDate.of(2023, 10, 12);

        Pagamento pagamento1 = new BoletoBancario(10.0, data1, "65656594948451813");
        Pagamento pagamento2 = new PayPal(4000.0, data2, "felipeaaaa@gmail.com", 2.0F);
        Pagamento pagamento3 = new CartaoCredito(200.0, data3, "32165469879", 2000.0, "Visa");

        System.out.println(pagamento1.getData());
        System.out.println(pagamento2.getValor());
        System.out.println(pagamento3.getValor());
    }
}
