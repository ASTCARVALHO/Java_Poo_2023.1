package ufpb.AntonioSergio.amigoSecreto;

public abstract class Mensagem {
    private String texto;
    private String emailRemetente;
    private boolean ehAnonima;

    public Mensagem(String texto, String emailRemetente, boolean ehAnonima){
        this.texto = texto;
        this.emailRemetente=emailRemetente;
        this.ehAnonima=ehAnonima;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public boolean ehAnonima() {
        return ehAnonima;
    }

    public void setEhAnonima(boolean ehAnonima) {
        this.ehAnonima = ehAnonima;
    }

}
