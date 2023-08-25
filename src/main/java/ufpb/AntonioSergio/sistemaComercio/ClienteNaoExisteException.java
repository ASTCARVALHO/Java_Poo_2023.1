package ufpb.AntonioSergio.sistemaComercio;

public class ClienteNaoExisteException extends Exception {
    public ClienteNaoExisteException(String msg){
        super(msg);
    }
    public ClienteNaoExisteException(){
        super();
    }
}
