package ufpb.AntonioSergio.amigoSecreto;

public class MensagemParaTodos extends Mensagem{
    public MensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
        super(texto, emailRemetente, ehAnonima);
    }
    public String getTextoCompletoAExibir(){
        if(super.ehAnonima()){
            return "Mensagem para todos" + "\n Mensagem:" + super.getTextoCompletoAExibir();
        }
        return "Mensagem de: " + super.getEmailRemetente() + " para todos" + "\n Mensagem:" + super.getTextoCompletoAExibir();
    }
}
