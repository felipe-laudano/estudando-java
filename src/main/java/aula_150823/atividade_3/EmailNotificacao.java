package aula_150823.atividade_3;

public class EmailNotificacao implements Notificavel{

    private String emailDestin;
    private String emailOrigem;
    private String mensagem;

    public EmailNotificacao(String emailDestin, String emailOrigem, String mensagem) {
        this.emailDestin = emailDestin;
        this.emailOrigem = emailOrigem;
        this.mensagem = mensagem;
    }

    @Override
    public void notificar() {
        System.out.println("De: " + emailOrigem + "\nPara: " + emailDestin + "\nMensagem: " + mensagem);
    }
}
