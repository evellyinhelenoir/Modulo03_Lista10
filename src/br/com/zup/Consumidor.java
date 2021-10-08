package br.com.zup;

public class Consumidor {
    private String email;
    private String nome;

    public Consumidor(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome do consumidor: "+nome);
        retorno.append("\nEmail do consumidor: "+email);
        return retorno.toString();
    }
}
