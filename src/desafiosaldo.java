import java.util.Scanner;

public class desafiosaldo {
    public static void main(String[] args) {
        String nome = "Russão";
        String tipoConta = "corrente";
        double saldo = 2599.99;
        int opcao = 0;


        System.out.println("***********");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("saldo atual: " + saldo);
        System.out.println(" \n***********");

        String menu = """
                ** Digite a sua opção **
                1- consultar saldo
                2- transferir valor 
                3- receber valor
                4- sair
                """;

        Scanner leitura = new Scanner(System.in);


        while (opcao != 4 ) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao ==1) {
                System.out.println("o saldo atualizado é " + saldo);

            } else if (opcao ==2) {
                System.out.println("qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("não há saldo para realizar a transferência.");

                } else {
                    saldo -= valor;
                    System.out.println("novo saldo: " + saldo);

                }
            } else if (opcao ==3) {
                System.out.println("valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("novo saldo: " + saldo);

            } else if (opcao!= 4) {
                System.out.println("opção inválida");
                
            }


        }


    }
}
