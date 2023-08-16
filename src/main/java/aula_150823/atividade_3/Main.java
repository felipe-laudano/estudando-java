package aula_150823.atividade_3;

public class Main {
    public static void main(String[] args) {
        Notificavel email = new EmailNotificacao("felipe@gmail.com", "joao@email.com", "Bem vindo a nossa plataforma!");
        Notificavel sms = new SMSNotificacao("11976648552", "11954687898", "Salve salve!");

        email.notificar();
        sms.notificar();
    }
}
