package amigoSecreto;

import ufpb.AntonioSergio.amigoSecreto.*;

import java.util.ArrayList;
import java.util.List;

public class TesteSistemaAmigo {

    public static void main(String[] args) {
        SistemaAmigo sistemaAmigo = new SistemaAmigo();

        try {
            sistemaAmigo.cadastraAmigo("José", "jose@gmail.com");
            sistemaAmigo.cadastraAmigo("Maria", "maria@gmail.com");
        }catch (AmigoJaExisteException a){
            System.out.println(a.getMessage());
        }



        try {
            sistemaAmigo.configuraAmigoSecretoDe("jose@gmail.com", "maria@gmail.com");
        } catch (AmigoInexistenteException a) {
            System.out.println(a.getMessage());
        }
        try {
            sistemaAmigo.configuraAmigoSecretoDe("maria@gmail.com", "jose@gmail.com");
        } catch (AmigoInexistenteException a) {
            System.out.println(a.getMessage());
        }
        try {
            System.out.println(sistemaAmigo.pesquisaAmigoSecreto("jose@gmail.com"));
        } catch (AmigoInexistenteException e){
            System.out.println(e.getMessage());
        }catch (AmigoNaoSorteadoException i){
            System.out.println(i.getMessage());
        }
        sistemaAmigo.enviarMensagemParaAlguem("Ola maria","jose@gmail.com","maria@gmail.com", true);
        sistemaAmigo.enviarMensagemParaAlguem("Ola jose","maria@gmail.com","jose@gmail.com",true);

        for (Mensagem a: sistemaAmigo.pesquisaMensagensAnonimas()) {
            System.out.println(a.getTextoCompletoAExibir());
        }




    }
}
