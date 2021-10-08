package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFaturas(String email, double valor, String dataVencimento) throws Exception{
        Consumidor consumidor = ServicoConsumidor.verificarEmailConsumidor(email);
        Fatura fatura = new Fatura(valor, dataVencimento, consumidor);
        faturas.add(fatura);
        return fatura;
    }
    public static List<Fatura> verificarFaturasPeloEmailConsumidor(String email){
        List<Fatura> faturasUsuario = new ArrayList<>();
        for (Fatura referencia : faturas ){
            if (referencia.getConsumidor().getEmail().equalsIgnoreCase(email)){
                faturasUsuario.add(referencia);
            }
        }return faturasUsuario;
    }
}
