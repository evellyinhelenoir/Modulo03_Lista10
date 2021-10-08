package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    public static List<Consumidor> consumidores = new ArrayList<>();

    public static void verificarEmailValido(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido.");
        }
    }
    public static Consumidor verificarSeOEmailJaEstaCadastrado(String email) throws Exception{
        for (Consumidor referencia : consumidores ){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Email já cadastrado");
            }
        }
        return null;
    }
    public static Consumidor verificarEmailConsumidor(String email) throws Exception{
        for(Consumidor referencia : consumidores) {
            if (referencia.getEmail().equalsIgnoreCase(email)) {
                return referencia;
            }
        }throw new Exception("Email não está cadastrado");
    }
    public static Consumidor cadastrarConsumidores(String nome, String email)throws Exception{
        verificarEmailValido(email);
        verificarSeOEmailJaEstaCadastrado(email);
        Consumidor consumidor = new Consumidor(email, nome);
        consumidores.add(consumidor);
        return consumidor;
    }
}
