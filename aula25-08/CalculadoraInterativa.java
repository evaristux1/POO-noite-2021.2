package e0825;

import java.util.Scanner;

public class CalculadoraInterativa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM VINDO A CALCULADORA");

        int opcao = 0;
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Calcular");
            System.out.println("2 - Sair");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    calcular(scanner);
                    break;
                case 2:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 2);
    }

    public static void calcular(Scanner scanner) {
        System.out.print("Digite o valor 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o valor 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Digite a operação (+-*/): ");
        String operacao = scanner.next();

        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
        }

        System.out.println("O resultado da operação é: " + resultado);
    }

}
