package ufpb.AntonioSergio.amigoSecreto;

public class MensagemParaAlguem extends Mensagem {

    private String emailDestinatario;
    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        super(texto, emailRemetente, ehAnonima);
        this.emailDestinatario = emailDestinatario;
    }
    public String getEmailDestinatario(){
        return emailDestinatario;
    }
    public void setEmailDestinatario(String emailDestinatario){
        this.emailDestinatario = emailDestinatario;
    }
    public String getTextoCompletoAExibir(){
        if(super.ehAnonima()){
        return "Mensagem para: " + this.emailDestinatario + "\n Mensagem: " + super.getTextoCompletoAExibir();
        }
        return "Mensagem de:" + super.getEmailRemetente() + "\n Para" + this.emailDestinatario + "\n Mensagem:" + super.getTextoCompletoAExibir();
    }
}
