package aula_040823.atividade;

public class SystemBank {

    public static void main(String[] args) {
        Banco itau = new Banco();

        Cliente Felipe = new Cliente("Felipe", 21, "405.342.598-65");
        Cliente Renato = new Cliente("Renato", 14, "401.342.598-61");
        Cliente Maria = new Cliente("Maria", 40, "422.342.598-62");

        itau.criarConta(Felipe);
        itau.criarConta(Renato);
        itau.criarConta(Maria);

        itau.buscarConta(3).depositar(15000.0);
        itau.buscarConta(3).sacar(250.0);

        itau.listarContas();
    }
}
