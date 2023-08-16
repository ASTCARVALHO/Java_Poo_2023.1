package ufpb.AntonioSergio.amigoSecreto;

public class AmigoJaExisteException extends Exception {
    public  AmigoJaExisteException (String msg){
        super(msg);
    }
    public AmigoJaExisteException(){
        super();
    }
}
