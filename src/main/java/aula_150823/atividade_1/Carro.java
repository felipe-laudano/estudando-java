package aula_150823.atividade_1;

import java.time.Year;

public class Carro extends Veiculo {
    private Boolean blindado;

    public Carro() {
    }

    public Carro(String marca, String modelo, Year ano, Boolean blindado) {
        super(marca, modelo, ano);
        this.blindado = blindado;
    }

    public Boolean getBlindado() {
        return blindado;
    }

    public void setBlindado(Boolean blindado) {
        this.blindado = blindado;
    }
}
