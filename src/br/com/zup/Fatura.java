package br.com.zup;

public class Fatura {
    private double valor;
    private String dataVencimento;
    private Consumidor consumidor;

    public Fatura(double valor, String dataVencimento, Consumidor consumidor) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nInformações da fatura");
        retorno.append("\nConsumidor: "+consumidor);
        retorno.append("\nValor: "+valor);
        retorno.append("\nData de Vencimento: "+dataVencimento);
        return retorno.toString();
    }
}
