package e0823;

public class Main {

    public static void main(String[] args) {
        Voo voo = new Voo("Fortaleza", "Brasilia", 156);
        for (int i = 0; i < 100; i++) {
            voo.embarcarPassageiro();
        }

        Integer qtdPassageiros = voo.calcularDiferencaPassageiros();
        if (qtdPassageiros == null) {
            System.out.println("Não pode verificar AINDA a diferença de passageiros, pois o embarque ainda não finalizou");
        }

        voo.finalizarEmbarque();

        qtdPassageiros = voo.calcularDiferencaPassageiros();
        if (qtdPassageiros == null) {
            System.out.println("Não pode verificar AINDA a diferença de passageiros, pois o embarque ainda não finalizou");
        } else {
            System.out.println("A diferença de passageiros é de: " + qtdPassageiros);
        }
    }
}
