package ufpb.AntonioSergio.sistemaComercio;

public class ClienteCpf extends Cliente {
    private String cpf;
    ClienteCpf(String nome, String endereco, String email,String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }
    public String getId(){
        return this.cpf;
    }
}
