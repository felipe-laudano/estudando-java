package aula_310723;

class Garrafa {
    float volume;

    public float obterVolume() {
        return this.volume;
    }

}
// modificadores de acesso: public, private, protected
public class EstudoMetodos2 {
    // Métodos/Funções -> São estruturas que executam uma determinada tarefa/atividade

    //Funções que recebem parâmetros e que não recebem
    //Funções que retornam valores e que não retornam
    public static String bemVindo(String nome, int idade) { //static -> dentro de um metodo static só pode fazer uma chamada de metodo static
        return "Bem-vindo " + nome + ", idade: " + idade;
    }

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double soma(double n1, double n2, double n3) {
        double s = n1 + n2 + n3;
        return s;
    }
    //sobrecarga de funções, só não podem ter a mesma quantidade de parametros do mesmo tipo
    public static double soma(double n1, double n2) {
        double s = n1 + n2;
        return s;
    }

    public static void main(String[] args) {

//        System.out.println(bemVindo("Felipe", 21)); //dentro do main static foi chamado o bemVindo static
//
//        double resultado = soma(1.5, 1.6, 1.8);
//        System.out.println(resultado);

        Garrafa garrafa = new Garrafa(); //aqui funcionou porque a instância foi feita dentro de um método static, ai o objeto herda o static
        garrafa.volume = 1.5F;

        float volumeGarrafa = garrafa.obterVolume();
        System.out.println(volumeGarrafa + " Litros");
    }
}
