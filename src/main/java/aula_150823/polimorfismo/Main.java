package aula_150823.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Animal rato = new Animal("Rato", "Mus musculus", "Bueiro");
        System.out.println(rato.getNome());
        System.out.println(rato.getEspecie());
        System.out.println(rato.getHabitat());

        Gato gato0 = new Gato();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato0.setCorPelo("Marrom");
        System.out.println(gato0.getCorPelo());
//        gato.setCorPelo("Pedreis"); Invalido
//        System.out.println(gato.getCorPelo()); Invalido
        gato.emitirSom();
        cachorro.emitirSom();
    }
}
