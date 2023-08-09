package ufpb.AntonioSergio.amigoSecreto;

import java.util.ArrayList;
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
       List<Mensagem> mensagensAnonimasPesquisa = new ArrayList<>();

        for (Mensagem msg: this.mensagens) {
            if(msg.ehAnonima()){
                mensagensAnonimasPesquisa.add(msg);
            }
        }return mensagensAnonimasPesquisa;
    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        return null;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa,String emailDoAmigoSorteado){

    }
    public String  pesquisaAmigoSecreto(String emailDaPessoa){
        return null;
    }

}
