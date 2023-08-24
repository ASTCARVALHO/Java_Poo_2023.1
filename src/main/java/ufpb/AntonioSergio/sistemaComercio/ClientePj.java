package ufpb.AntonioSergio.sistemaComercio;

public class ClientePj extends Cliente {
    private String cnpj;

    ClientePj(String nome, String endereco, String email,String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }


    public String getId() {
        return cnpj;
    }
}
