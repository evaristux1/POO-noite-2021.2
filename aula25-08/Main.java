package e0825;

import java.util.Scanner;

public class Main {

    private static Circulo[] circulos;
    private static int qtdCirculos;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique a quantidade máxima de círculos: ");
        int max = scanner.nextInt();
        circulos = new Circulo[max];
        qtdCirculos = 0;

        int opcao = 0;
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Escolher um círculo existente");
            System.out.println("2 - Criar um novo círculo");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    escolherCirculoExistente(scanner);
                    break;
                case 2:
                    criarNovoCirculo(scanner);
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }

    public static void escolherCirculoExistente(Scanner scanner) {
        System.out.print("Indique o índice do círculo que você quer acessar (de 0 a " + (qtdCirculos - 1) + " a): ");
        int indice = scanner.nextInt();

        Circulo circulo = circulos[indice];

        int opcao = 0;
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Imprimir as informações");
            System.out.println("2 - Configurar circunferencia");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Circunferencia = " + circulo.getCircunferencia());
                    break;
                case 2:
                    System.out.print("Digite a circunferencia: ");
                    int valor = scanner.nextInt();
                    circulo.setCircunferencia(valor);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 1 && opcao != 2);

    }

    public static void criarNovoCirculo(Scanner scanner) {
        System.out.print("Digite a circunferencia do novo círculo (em cm): ");
        int circunferencia = scanner.nextInt();

        int indice = qtdCirculos;

        Circulo circulo = new Circulo(circunferencia);
        circulos[indice] = circulo;

        qtdCirculos++;
    }

}
