package aula_150823.atividade_3;

public class SMSNotificacao implements Notificavel{

    private String numDest;
    private String numOrig;
    private String message;

    public SMSNotificacao(String numDest, String numOrig, String message) {
        this.numDest = numDest;
        this.numOrig = numOrig;
        this.message = message;
    }

    @Override
    public void notificar() {
        System.out.println("De: " + numOrig + "\nPara: " + numDest + "\nMensagem: " + message);
    }
}
