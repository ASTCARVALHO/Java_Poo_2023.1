package ufpb.AntonioSergio.amigoSecreto;

public class MensagemParaAlguem extends Mensagem {

    private String emailDestinatario;
    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        super(texto, emailRemetente, ehAnonima);
        this.emailDestinatario = emailDestinatario;
    }
    public String getEmailDestinatario(){
        return null;
    }
    public void setEmailDestinatario(String emailDestinatario){

    }
    public String getTextoCompletoAExibir(){
        return null;
    }
}
