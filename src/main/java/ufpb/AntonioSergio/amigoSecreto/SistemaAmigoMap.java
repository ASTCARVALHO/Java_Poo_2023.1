package ufpb.AntonioSergio.amigoSecreto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SistemaAmigoMap {
    private List<Mensagem> mensagens;
    private Map<String, Amigo> amigos;

    public SistemaAmigoMap(){
        this.mensagens = new ArrayList<>();
        this.amigos = new HashMap<>();
    }

    public void CadastrarAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException{
        if(amigos.containsKey(emailAmigo)) throw new AmigoJaExisteException();
        else{ Amigo novoAmigo = new Amigo(nomeAmigo,emailAmigo);
            amigos.put(emailAmigo,novoAmigo);
        }
    }
    public Amigo pesquisarAmigo(String emailAmigo) throws AmigoInexistenteException{
        Amigo amigoPesquisado = null;
        if(!amigos.containsKey(emailAmigo)) throw new AmigoInexistenteException();
        return amigos. get(emailAmigo);
    }
}
