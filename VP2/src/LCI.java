public class LCI  extends Investimento  {

    public LCI(String instituicaoFinanceira, double valorAplicado, double taxaDeRendimentoAoAno) {
        super(instituicaoFinanceira, valorAplicado, taxaDeRendimentoAoAno);
    }

    @Override
    public void calculaLucro() {
        double valorRendimento = getTaxaDeRendimentoAoAno() * getValorAplicado();
        super.setLucro(valorRendimento);
    }

    public double getLucro() {
        calculaLucro();
        return super.getLucro();
    }
}
