package aula_160823.interfaces;

public class Main {
    public static void mostrarAreaForma(Forma forma) {
        System.out.println("Area: " + forma.calculaArea());
        System.out.println("Perimetro: " + forma.calculaPerim());
    }
    public static void main(String[] args) {

        Forma quadrado = new Quadrado(6.0);

    }
}
