package aula_150823.atividade_1;

import java.time.Year;
//Crie uma classe Veiculo com propriedades como marca, modelo e ano.
// Em seguida, crie subclasses como Carro e Moto que herdam de Veiculo.

public class Veiculo {
    private String marca;
    private String modelo;
    private Year ano;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, Year ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(Year ano) {
        this.ano = ano;
    }
}
