package ufpb.AntonioSergio.amigoSecreto;

public class AmigoNaoSorteadoException extends Exception {
    public AmigoNaoSorteadoException(){
        super();
    }
    public AmigoNaoSorteadoException(String mensagem){
        super(mensagem);
    }
}
