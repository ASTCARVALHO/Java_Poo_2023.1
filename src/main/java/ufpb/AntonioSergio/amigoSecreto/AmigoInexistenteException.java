package ufpb.AntonioSergio.amigoSecreto;

public class AmigoInexistenteException extends Exception {
    public AmigoInexistenteException(){
        super();
    }
    public AmigoInexistenteException(String mensagem){
        super(mensagem);
    }

}
