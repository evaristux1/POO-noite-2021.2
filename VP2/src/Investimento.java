public abstract class Investimento {

    private final String  instituicaoFinanceira;
    private final double  taxaDeRendimentoAoAno;
    private double valorAplicado;
    private double lucro;

    public Investimento(String instituicaoFinanceira,  double valorAplicado ,double taxaDeRendimentoAoAno) {
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.taxaDeRendimentoAoAno = taxaDeRendimentoAoAno;
        this.valorAplicado = valorAplicado;

    }


    public abstract void calculaLucro();

    public double getTaxaDeRendimentoAoAno() {
        return taxaDeRendimentoAoAno;
    }
    public double getValorAplicado() {
        return valorAplicado;
    }
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
    public double getLucro() {
        return lucro;
    }

}
