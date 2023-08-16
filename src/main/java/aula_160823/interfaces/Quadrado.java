package aula_160823.interfaces;

public class Quadrado implements Forma{
    private Double lado;

    public Quadrado() {
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        Double area = this.lado * this.lado;
        return area;
    }

    @Override
    public double calculaPerim() {
        return 0;
    }
}
