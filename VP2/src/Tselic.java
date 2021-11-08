public class Tselic  extends  Investimento{

    public Tselic(String instituicaoFinanceira, double valorAplicado, double taxaDeRendimentoAoAno) {
        super(instituicaoFinanceira, valorAplicado, taxaDeRendimentoAoAno);

    }

    public void calculaLucro() {
        double valorRendimento = getTaxaDeRendimentoAoAno() * getValorAplicado();
        double valorImposto = valorRendimento * 0.15;
        super.setLucro( valorRendimento -valorImposto);
    }

    public double getLucro() {
        calculaLucro();
        return super.getLucro();
    }
}
