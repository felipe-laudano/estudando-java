package aula_150823.polimorfismo;

public class Gato extends Animal {
    private String corPelo;

    //sobrecarga de método -> reescrever um método
    @Override // -> Anotação
    public void emitirSom() {
        System.out.println("miau, miau!");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
