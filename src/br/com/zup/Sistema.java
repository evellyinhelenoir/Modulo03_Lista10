package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void menu(){
        System.out.println("\nBem vindo ao sistema de gerenciamento de faturas da Eve!\n" +
                "Digite 1 para cadastrar uma nova fatura.\n" +
                "Digite 2 para cadastrar um novo consumidor.\n" +
                "Digite 3 para consultar as faturas de um consumidor.\n" +
                "Digite 4 para fechar o programa.");
    }
    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static Consumidor cadastrarConsumidores() throws Exception{
        String nome = capturarDados("Digite o nome do consumidor: ").nextLine();
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        return ServicoConsumidor.cadastrarConsumidores(nome, email);
    }
    public static Fatura cadastrarFatura() throws Exception{
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        double valor = capturarDados("Digite o valor da fatura: ").nextDouble();
        String dataVencimento = capturarDados("Digite a data de vencimento da fatura: ").nextLine();
        return ServicoFatura.cadastrarFaturas(email, valor, dataVencimento);
    }
    public static List<Fatura> pesquisarFaturas(String email){
        List<Fatura> faturas = ServicoFatura.verificarFaturasPeloEmailConsumidor(email);
        return faturas;
    }
    public static boolean executar() throws Exception{
        boolean loop = true;
        while (loop){
        menu();
        int opcao = capturarDados("\nDigite a opção desejada.").nextInt();

            if (opcao == 1){
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            }else if (opcao == 2){
                Consumidor consumidor = cadastrarConsumidores();
                System.out.println(consumidor);
            }else if (opcao == 3){
                pesquisarFaturas(capturarDados("Digite o email do consumidor.").nextLine());
                System.out.println();
            }else if (opcao == 4 ){
                System.out.println("Obrigada por utilizar nossos serviços!");
                loop = false;
            }
        }return true;
    }
}
