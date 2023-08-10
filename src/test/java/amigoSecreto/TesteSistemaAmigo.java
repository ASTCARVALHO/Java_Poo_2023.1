package amigoSecreto;

import ufpb.AntonioSergio.amigoSecreto.Amigo;
import ufpb.AntonioSergio.amigoSecreto.AmigoInexistenteException;
import ufpb.AntonioSergio.amigoSecreto.SistemaAmigo;

import java.util.ArrayList;
import java.util.List;

public class TesteSistemaAmigo {

    public static void main(String[] args) {
        SistemaAmigo sistemaAmigo = new SistemaAmigo();

        sistemaAmigo.cadastraAmigo("José", "jose@gmail.com");
        sistemaAmigo.cadastraAmigo("Maria", "maria@gmail.com");
        List<Amigo> todosAmigos = sistemaAmigo.amigosParticipantes();
        System.out.println(todosAmigos.toString());

        try {
            sistemaAmigo.configuraAmigoSecretoDe("jose@gmail.com", "mari@gmail.com");
        } catch (AmigoInexistenteException a) {
            System.out.println(a.getMessage());
        }
        try {
            sistemaAmigo.configuraAmigoSecretoDe("maria@gmail.com", "jose@gama.com");
        } catch (AmigoInexistenteException a) {
            System.out.println(a.getMessage());
        }


    }
}
