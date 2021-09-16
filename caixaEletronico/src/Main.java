import java.util.Scanner;

public class Main {

    private static ContaCorrente[] contasCorrentes;
    private static int qtdeContas;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contasCorrentes = new ContaCorrente[10];
        qtdeContas =  0;

        int opcao = 0;
        do {
            System.out.println("**************BEM VINDO AO CUBOBANK**************:");
            System.out.println("Agora, escolha o que você deseja fazer:");
            System.out.println("1 - Acessar minha conta");

            System.out.println("2 - Criar uma nova conta");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    acessarConta(scanner);
                    break;
                case 2:
                    criarConta(scanner);
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }

    public static void acessarConta(Scanner scanner) {
        System.out.print("Digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();

        ContaCorrente minhaConta = contasCorrentes[numeroConta];
        if (minhaConta != null) {

            int opcao = 0;
            do {
                System.out.println("Bem vindo a sua conta!\n O que você deseja fazer?");
                System.out.println("1 - Sacar");
                System.out.println("2 - Transferir");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Sair");
                System.out.println("5 - depositar");
                 System.out.println("6 - informações da conta");
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Quanto  você quer retirar? ");
                        float valorSaque = scanner.nextFloat();

                        if(contasCorrentes[minhaConta.numConta].saldo>=valorSaque) {

                            contasCorrentes[minhaConta.numConta].saldo = contasCorrentes[minhaConta.numConta].saldo - valorSaque;
                            System.out.print("Saque realizado com sucesso!\n");

                        }else
                        {
                            System.out.print("Você não tem saldo suficiente!\n Saldo atual R$ "+contasCorrentes[minhaConta.numConta].saldo+"\n");
                            opcao =1;
                        }
                        break;
                    case 2:
                        System.out.print("Digite a conta de quem irá receber\n");
                        int numeroContaDestino = scanner.nextInt();

                        if (contasCorrentes[numeroContaDestino] != null) {
                            System.out.print("Agora o valor que você deseja trasferir:\n");
                            float valorTransferir = scanner.nextFloat();

                            if(contasCorrentes[minhaConta.numConta].saldo>= valorTransferir){
                                contasCorrentes[minhaConta.numConta].saldo=-valorTransferir;
                                contasCorrentes[numeroContaDestino].saldo +=valorTransferir;
                            }else{
                                System.out.print("Você não tem saldo suficiente!\n Saldo atual R$ "+contasCorrentes[minhaConta.numConta].saldo+"\n");
                                opcao =2;
                            }
                            }else{
                            System.out.print("Conta Destino inexistente!.\n");
                            opcao= 2;
                            }
                            break;
                    case 3:
                        System.out.print("Saldo Atual em sua conta: R$ "+minhaConta.saldo+"\n");

                        break;
                    case 4:
                        System.out.print("Voltar");

                        break;
                    case 5:
                        System.out.println("Quanto  você quer depositar?\n");
                        float valorDeposito = scanner.nextFloat();


                            contasCorrentes[minhaConta.numConta].saldo +=  valorDeposito;

                        break;
                                  case 6:
                        System.out.println("CPF do titular:"+contasCorrentes[minhaConta.numConta].cpfCliente);

                        System.out.println("valor em conta:"+contasCorrentes[minhaConta.numConta].saldo);


                        break;

                    default:
                        opcao = 4;
                }
            } while (opcao != 4);
        } else {
            System.out.print("Oops, parece que não existe nenhuuma conta com essa numeração!\n");

        }
    }

    public static void criarConta(Scanner scanner) {
        System.out.print("Então você é novo por aqui? Fico feliz em lhe dar boas vindas!");
        System.out.print("\nAgora, digite o seu cpf:\n");
        String cpf = scanner.next();

        int numeroConta = qtdeContas;

        ContaCorrente conta = new ContaCorrente(numeroConta,cpf,0);
        contasCorrentes[numeroConta] = conta;
        System.out.print("\nOBAA! sua conta foi criada com sucesso!\n");
        System.out.print("numero da conta => "+numeroConta+"\n");


        qtdeContas++;


    }

}
