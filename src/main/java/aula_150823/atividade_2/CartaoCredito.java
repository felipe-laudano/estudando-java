package aula_150823.atividade_2;

import java.time.LocalDate;

public class CartaoCredito extends Pagamento {

    private String numero;
    private Double limite;
    private String bandeira;

    public CartaoCredito() {
    }

    public CartaoCredito(Double valor, LocalDate data, String numero, Double limite, String bandeira) {
        super(valor, data);
        this.numero = numero;
        this.limite = limite;
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
