package ufpb.AntonioSergio.exemplo;

public class Pessoa {
    private String nome;
    private String genero;
    private String cpf;

    public Pessoa(String nome, String genero, String cpf) {
        this.nome = nome;
        this.genero = genero;
        this.cpf = cpf;
    }
    public Pessoa (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        genero = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

