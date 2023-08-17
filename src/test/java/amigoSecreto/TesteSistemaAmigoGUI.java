package amigoSecreto;

import ufpb.AntonioSergio.amigoSecreto.*;
import javax.swing.JOptionPane;

import javax.swing.*;

public class TesteSistemaAmigoGUI {
    public static void main(String[] args) {
        SistemaAmigo sistemaAmigo = new SistemaAmigo();
        int qntAmigos = Integer.parseInt(JOptionPane.showInputDialog(null, "Qantidade de amigos: "));
        for (int i = 0; i < qntAmigos; i++) {
            try {
            String nome = JOptionPane.showInputDialog("Nome: ");
            String email = JOptionPane.showInputDialog("email: ");
            sistemaAmigo.cadastraAmigo(nome, email);
            }catch (AmigoJaExisteException e){
                System.out.println(e.getMessage());
            }
        }

        for (Amigo a: sistemaAmigo.getAmigos()) {
            String emailDoAmigo = JOptionPane.showInputDialog("emailDoAmigo");
            String emailDoAmigoSorteado = JOptionPane.showInputDialog("Email do amigo sorteado: ");
            try {
                sistemaAmigo.configuraAmigoSecretoDe(emailDoAmigo,emailDoAmigoSorteado);
            }catch (AmigoInexistenteException e){
                System.out.println(e.getMessage());
            }
        }
        String emailRemetente = JOptionPane.showInputDialog("Email remetente: ");
        String mensagem = JOptionPane.showInputDialog("Mensagem: ");
        sistemaAmigo.enviarMensagemParaTodos(mensagem, emailRemetente,false);
        for (Mensagem a: sistemaAmigo.pesquisaTodasAsMensagens()) {
            JOptionPane.showMessageDialog(null, a.getTextoCompletoAExibir());
        }

    }
}
