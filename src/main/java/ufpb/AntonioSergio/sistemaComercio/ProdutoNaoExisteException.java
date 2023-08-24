package ufpb.AntonioSergio.sistemaComercio;

public class ProdutoNaoExisteException extends Exception{
    public ProdutoNaoExisteException(String msg){
        super("Produto não existe");
    }
    public ProdutoNaoExisteException(){
        super();
    }

}
