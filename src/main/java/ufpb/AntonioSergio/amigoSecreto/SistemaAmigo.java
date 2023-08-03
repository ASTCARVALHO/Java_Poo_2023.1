package ufpb.AntonioSergio.amigoSecreto;

import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public void cadastraAmigo(String nomeAmigo, String emailAmigo){

    }
    public Amigo pesquisaAmigo  (String emailAmigo){
        return null;
    }
    public void enviarMensagemParaTodos(String texto, String emailRemetente,boolean ehAnonima ){

    }
    public void enviarMensagemParaAlguem(String texto, String emailRemetente, boolean ehAnonima){
    //todo
    }
    public List<Mensagem> pesquisaMensagensAnonimas(){
        return null;
    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        return null;
    }
    public void configurarAmigoSecretoDe(String emailDaPessoa,String emailDoAmigoSorteado){

    }
    public String  pesquisaAmigoSecreto(String emailDaPessoa){
        return null;
    }

}
