package ufpb.AntonioSergio.amigoSecreto;

<<<<<<< HEAD
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
        sistemaAmigoMap.enviarMensagemParaTodos("oi",a.getEmail(),true);
        List<Mensagem> mensagensEncontradas = sistemaAmigoMap.pesquisaTodasAsMensagens();
        assertTrue(mensagensEncontradas.size() == 1);
        assertTrue(mensagensEncontradas.get(0).getEmailRemetente().equals("antonio@gmail.com"));


=======
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaAmigoMapTest {

    @Test
    void cadastrarAmigo() {

    }

    @Test
    void pesquisarAmigo() {
    }

    @Test
    void enviarMensagemParaTodos() {
>>>>>>> origin/master
    }

    @Test
    void enviarMensagemParaAlguem() {
    }

    @Test
    void pesquisaMensagensAnonimas() {
    }

    @Test
    void pesquisaTodasAsMensagens() {
    }

    @Test
    void configurarAmigoSecreto() {
    }

    @Test
    void pesquisaAmigoSecreto() {
    }
}