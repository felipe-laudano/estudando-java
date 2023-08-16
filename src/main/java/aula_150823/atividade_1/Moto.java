package aula_150823.atividade_1;

import java.time.Year;

public class Moto extends Veiculo {
    private String categoria;
    private Float volumeBagageiro;

    public Moto() {
    }

    public Moto(String marca, String modelo, Year ano, String categoria, Float volumeBagageiro) {
        super(marca, modelo, ano);
        this.categoria = categoria;
        this.volumeBagageiro = volumeBagageiro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
