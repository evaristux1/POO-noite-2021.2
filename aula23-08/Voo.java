package e0823;

public class Voo {

    private final String origem;
    private final String destino;
    private final int bilhetesVendidos;
    private int passageiros;
    private boolean embarqueFinalizado;

    public Voo(String origem, String destino, int bilhetesVendidos) {
        this.origem = origem;
        this.destino = destino;
        this.bilhetesVendidos = bilhetesVendidos;
        this.passageiros = 0;
        this.embarqueFinalizado = false;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigem() {
        return origem;
    }

    public int getBilhetesVendidos() {
        return bilhetesVendidos;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void embarcarPassageiro() {
        passageiros++;
    }

    public void finalizarEmbarque() {
        embarqueFinalizado = true;
    }

    public Integer calcularDiferencaPassageiros() {
        if (embarqueFinalizado) {
            return bilhetesVendidos - passageiros;
        } else {
            return null;
        }
    }

}
