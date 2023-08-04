package aula_030823;

public class EstudoModificadores {
    //Modificadores

//Acesso
    //public -> acesso fora da classe e fora do pacote que ele foi definido
    //private -> não tem acesso fora da classe, somente dentro da propria classe
    //protected -> acesso somente pelas classes do mesmo pac e por seu filhos
    //default -> padrão, acesso somente por classes do mesmo pacote
//Não acesso
    //static -> membro da classe e não do objeto
    //final -> para criar constantes
//Encapsulamento
    //Garante a consistência dos dados de uma classe
    public final double PI = 3.1415; //final cria uma constante (sempre em caixa alta)

    public static void main(String[] args) {
        Cliente maria = new Cliente("Maria", 25, 1.70);
        maria.setNome("Maria de Fátima");
        System.out.println(maria.getNome());
        System.out.println(maria.getIdade());
        System.out.println(maria.getDataNascimento());
        System.out.println(maria.getAltura());
        System.out.println(maria.getCpf());
        Cliente joao = new Cliente("João", 21, 1.65);
        joao.setEmail("joao@mail.com");
//        String mail = "ldaksldk";
//        //cliente1.email = "xxxxxxxx@xxx"; //n acessível, modif private
//        cliente1.validarCpf(); //método não static, acessível ao objeto
//        Cliente.validarEmail(mail); //método static, pertence a classe Cliente

    }


}
