package ufpb.AntonioSergio.amigoSecreto;

import java.util.*;


public class SistemaAmigoMap {
    private List<Mensagem> mensagens;
    private Map<String, Amigo> amigos;

    public SistemaAmigoMap(){
        this.mensagens = new ArrayList<>();
        this.amigos = new HashMap<>();
    }

    public void cadastrarAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException{
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
    public void enviarMensagemParaTodos(String texto,String emailRemetente, boolean ehAnonima){
        MensagemParaTodos novaMensagemParaTodos = new MensagemParaTodos(texto,emailRemetente,ehAnonima);
        novaMensagemParaTodos.getTextoCompletoAExibir();
        mensagens.add(novaMensagemParaTodos);
    }
    public  void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        MensagemParaAlguem novaMensagemParaAlguem = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        novaMensagemParaAlguem.getTextoCompletoAExibir();
        mensagens.add(novaMensagemParaAlguem);
    }
    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimasPesquisa = new ArrayList<>();

        for (Mensagem msg: this.mensagens) {
            if(msg.ehAnonima()) mensagensAnonimasPesquisa.add(msg);

        }return mensagensAnonimasPesquisa;
    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        List<Mensagem> todasMensagensEnviadas = new ArrayList<>();
        for (Mensagem msg: this.mensagens) todasMensagensEnviadas.add(msg);
        return todasMensagensEnviadas;
    }
    public void configurarAmigoSecreto(String emailDaPessoa, String emailDoAmigoSorteado) throws AmigoInexistenteException{
        if(!amigos.containsKey(emailDaPessoa)) throw new AmigoInexistenteException();
        if(!amigos.containsKey(emailDoAmigoSorteado))throw  new AmigoInexistenteException();
        Amigo amigo = amigos.get(emailDaPessoa);
        amigo.setEmailAmigoSorteado(emailDoAmigoSorteado);
    }
    public String pesquisaAmigoSecreto(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {
        if(!amigos.containsKey(emailDaPessoa)) throw new AmigoInexistenteException();
        else if(amigos.get(emailDaPessoa).getEmailAmigoSorteado() ==  null) throw new AmigoNaoSorteadoException();
        else return amigos.get(emailDaPessoa).getEmailAmigoSorteado();

    }
}
