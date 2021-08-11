import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        aluno.notaProva1 = input.nextFloat();

        System.out.println("Digite a nota 2: ");
        aluno.notaProva2 = input.nextFloat();

        System.out.println("Digite a nota do trabalho: ");
        aluno.notaTrabalho = input.nextFloat();

        if(aluno.estaAprovado(aluno.media())){
            System.out.println("O aluno foi aprovado: " + aluno.media());
        }else{
            System.out.println("O aluno foi reprovado: " + aluno.media());
        }

    }
}
