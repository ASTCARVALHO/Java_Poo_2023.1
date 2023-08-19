package ufpb.AntonioSergio.amigoSecreto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SistemaAmigoMapTest {
    SistemaAmigoMap sistemaAmigoMap;
    @BeforeEach
    void setup(){
         this.sistemaAmigoMap = new SistemaAmigoMap();
    }
    @Test
    void cadastrarEPesquisarAmigo() throws AmigoJaExisteException, AmigoInexistenteException {
        sistemaAmigoMap.cadastrarAmigo("Antonio", "antonio@gmail.com");
        Amigo a = sistemaAmigoMap.pesquisarAmigo("antonio@gmail.com");
        assertTrue(a.getEmail().equals("antonio@gmail.com"));
        assertTrue(a.getNome().equals("Antonio"));
    }
    @Test
    void enviarMensagemParaTodos() {
        Amigo a = new Amigo("Antonio", "antonio@gmail.com");
        sistemaAmigoMap.enviarMensagemParaTodos("oi", a.getEmail(), true);
        List<Mensagem> mensagensEncontradas = sistemaAmigoMap.pesquisaTodasAsMensagens();
        assertTrue(mensagensEncontradas.size() == 1);
        assertTrue(mensagensEncontradas.get(0).getEmailRemetente().equals("antonio@gmail.com"));

    }
    @Test
    void enviarMensagemParaAlguem(){
        Amigo a = new Amigo("Antonio", "antonio@gmail.com");
        Amigo b = new Amigo("fulano", "fulano@gmail.com");
        sistemaAmigoMap.enviarMensagemParaAlguem("oi",a.getEmail(),b.getEmail(),false);
        List<Mensagem> mensagensEncontradas = sistemaAmigoMap.pesquisaTodasAsMensagens();
        assertTrue(mensagensEncontradas.size() == 1);
        assertTrue(mensagensEncontradas.get(0).getEmailRemetente().equals("antonio@gmail.com"));
    }
    @Test
    void pesquisarMensagensAnonimas(){

        assertTrue(sistemaAmigoMap.pesquisaMensagensAnonimas().isEmpty());
        Amigo a = new Amigo("Antonio", "antonio@gmail.com");
        Amigo b = new Amigo("fulano", "fulano@gmail.com");
        sistemaAmigoMap.enviarMensagemParaAlguem("oi",a.getEmail(),b.getEmail(),false);
        assertTrue(sistemaAmigoMap.pesquisaMensagensAnonimas().isEmpty());
        sistemaAmigoMap.enviarMensagemParaAlguem("oi",a.getEmail(),b.getEmail(),true);
        assertTrue(sistemaAmigoMap.pesquisaMensagensAnonimas().size() == 1 );
    }
    @Test
    void pesquisaTodasAsMensagens(){
        assertTrue(sistemaAmigoMap.pesquisaTodasAsMensagens().isEmpty());
        Amigo a = new Amigo("Antonio", "antonio@gmail.com");
        sistemaAmigoMap.enviarMensagemParaTodos("oi",a.getEmail(),true);
        assertTrue(sistemaAmigoMap.pesquisaTodasAsMensagens().size() == 1);
        sistemaAmigoMap.enviarMensagemParaTodos("oi",a.getEmail(),false);
        assertTrue(sistemaAmigoMap.pesquisaTodasAsMensagens().size() == 2);

    }
    @Test
    void configuraEPesquisaAmigoSecreto() throws AmigoNaoSorteadoException, AmigoInexistenteException, AmigoJaExisteException {

            sistemaAmigoMap.cadastrarAmigo("Antonio","antonio@gmail.com");
            sistemaAmigoMap.cadastrarAmigo("Fulano", "fulano@gmail.com");
            sistemaAmigoMap.configurarAmigoSecreto("antonio@gmail.com","fulano@gmail.com");
            sistemaAmigoMap.configurarAmigoSecreto("fulano@gmail.com","antonio@gmail.com");
            assertEquals("antonio@gmail.com", sistemaAmigoMap.pesquisaAmigoSecreto("fulano@gmail.com"));
            assertEquals("fulano@gmail.com", sistemaAmigoMap.pesquisaAmigoSecreto("antonio@gmail.com"));
    }

}