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
        List<Mensagem> todasMensagensEnviadas = new ArrayList<>();
        for (Mensagem msg: this.mensagens) {
            todasMensagensEnviadas.add(msg);
        }
        return todasMensagensEnviadas;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa,String emailDoAmigoSorteado) throws AmigoInexistenteException{
        Amigo amigo = null;
        for (Amigo a: this.amigos) {
            if(a.getEmail().equals(emailDaPessoa)){
                a.setEmailAmigoSorteado(emailDoAmigoSorteado);
                amigo = a;
            }
        }
        if(amigo == null) throw new AmigoInexistenteException("Amigo de email:" + emailDaPessoa + "não encontrado");
    }
    public String  pesquisaAmigoSecreto(String emailDaPessoa) throws AmigoNaoSorteadoException, AmigoInexistenteException{
        Amigo amigo = null;
        for (Amigo a: this.amigos) {
            if(emailDaPessoa.equals(a.getEmail())) amigo = a;
            if(amigo == null){
                throw new AmigoInexistenteException("Amigo de email:" + emailDaPessoa + "não encontrado");
            } else if (amigo.getEmailAmigoSorteado() == null) {
                throw new AmigoNaoSorteadoException("Amigo secreto de: " + emailDaPessoa + " ainda não foi sorteado");
            }else
                return amigo.getEmailAmigoSorteado();
        }

        return null;
    }

}
