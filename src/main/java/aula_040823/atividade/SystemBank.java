package aula_040823.atividade;

public class SystemBank {

    public static void main(String[] args) {
        Banco itau = new Banco();

        Cliente Jose = new Cliente("Jose", 21, "405.342.598-65");
        Cliente Renato = new Cliente("Renato", 14, "401.342.598-61");
        Cliente Maria = new Cliente("Maria", 40, "422.342.598-62");

        //toString da classe Cliente, ele fica oculto
//        System.out.println(Jose);

        //Criando contas através do método criarConta da classe Banco
        itau.criarConta(Jose);
        itau.criarConta(Renato);
        itau.criarConta(Maria);

        //Localizando a conta pelo número e depois usando o toString da classe Conta, ele fica oculto
//        System.out.println(itau.buscarConta(1));

        //Utilizando o método buscarConta para encontrar uma conta e depositar 15.000 nela
        itau.buscarConta(1).depositar(15000.0);
        itau.buscarConta(1).sacar(250.0);
        //imprimindo conta novamente para ver alterações
//        System.out.println(itau.buscarConta(1));
//
//        //listar todas as contas do banco itau
//        itau.listarContas();
//
//        //toString da classe Banco
        System.out.println(itau);

    }
}
