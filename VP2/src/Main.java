import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List investimentos = new ArrayList();

        System.out.println("BEM VINDO AO 7INVEST \n SELECIONE UMA OPÇÃO:");
        menuIncial();
        int opcao;
        do{
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    menuSelecionarInvestimentos();

                    break;
                case 2:
                    int totalInvestimentos =(investimentos.size()!= 0)?investimentos.size():0;
                    System.out.print("SEUS INVESTIMENTOS\n");
                    System.out.print("TOTAL: " + totalInvestimentos+"\n");
                        double totalInvestido = 0;
                        double lucros = 0;
                    for (Object investimento : investimentos) {
                        lucros +=((Investimento) investimento).getLucro();

                        totalInvestido +=((Investimento) investimento).getValorAplicado();

                    }

                    double  percentualLucro = (lucros * 100/ totalInvestido);
                    System.out.print("TOTAL INVESTIDO R$: " +totalInvestido);
                    System.out.print("\nTOTAL DE LUCROS R$: " +lucros+"\n");

                    System.out.print("\nPERCENTUAL DE  LUCROS : " +percentualLucro+"%\n");
                    menuIncial();
                    break;
                case 3:

                 //SELIC
                    System.out.print("BOA ESCOLHA! AGORA, DIGITE A INSTITUIÇÃO FINANCEIRA: ");
                    String instituicaoFinanceiraSelic = scanner.next();
                    System.out.print("VALOR A SER APLICADO: ");
                    double valorAplicadoSelic = scanner.nextDouble();
                    System.out.print("QUAL A TAXA DE RENDIMENTO AO ANO  em %? \n");
                    double taxaRendimentoSelic = scanner.nextDouble();
                    Tselic selic = new Tselic(instituicaoFinanceiraSelic, valorAplicadoSelic, taxaRendimentoSelic);
                    investimentos.add(selic);

                    System.out.print("PRONTINHO, SEU DINHEIRO JA ESTÁ RENDENDO!\n");
                    menuIncial();
                    break;
                case 4:

                    //CDB
                    System.out.print("BOA ESCOLHA! AGORA, DIGITE A INSTITUIÇÃO FINANCEIRA: ");
                    String instituicaoFinanceiraCDB = scanner.next();
                    System.out.print("VALOR A SER APLICADO: ");
                    double valorAplicadoCDB = scanner.nextDouble();
                    System.out.print("QUAL A TAXA DE RENDIMENTO AO ANO  em %? \n");
                    double taxaRendimentoCDB = scanner.nextDouble();
                    CDB cdb = new CDB(instituicaoFinanceiraCDB, valorAplicadoCDB, taxaRendimentoCDB);
                    investimentos.add(cdb);

                    System.out.print("PRONTINHO, SEU DINHEIRO JA ESTÁ RENDENDO!\n");
                    menuIncial();
                    break;
                case 5:
                    //CLI
                    System.out.print("BOA ESCOLHA! AGORA, DIGITE A INSTITUIÇÃO FINANCEIRA: ");
                    String instituicaoFinanceirCLI = scanner.next();
                    System.out.print("VALOR A SER APLICADO: ");
                    double valorAplicadoCLI = scanner.nextDouble();
                    System.out.print("QUAL A TAXA DE RENDIMENTO AO ANO  em %? \n");
                    double taxaRendimentoCLI = scanner.nextDouble();
                    LCI lci = new LCI(instituicaoFinanceirCLI, valorAplicadoCLI, taxaRendimentoCLI);
                    investimentos.add(lci);

                    System.out.print("PRONTINHO, SEU DINHEIRO JA ESTÁ RENDENDO!\n");
                    menuIncial();
                    break;
                case 0:

                    break;
                default: menuIncial();
                break;

            }
        } while (opcao != 0);


    }
    public static void menuIncial(){
        System.out.println("1 - Registrar investimentos");
        System.out.println("2 - Visualizar meus lucros");
        System.out.println("0 - Sair");
    }

    public static void menuSelecionarInvestimentos(){
        System.out.println("Muito Bem, Agora selecione o tipo de investimento   que você deseja:");

        System.out.println("3 - Tesouro SELIC, com imposto fixo de 15% sobre o lucro");
        System.out.println("4 -  CDB, com imposto fixo de 15% sobre o lucro");
        System.out.println("5 -  LCI, sem imposto");
        System.out.println("0 - Sair");

    }

}