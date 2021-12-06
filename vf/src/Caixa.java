
public class Caixa {
    private nfe notaFiscal;
    private Cliente cliente;
    private CarrinhoCompras carrinho;


    public Caixa(Cliente cliente, CarrinhoCompras carrinho) {
        this.notaFiscal = new nfe(cliente, carrinho.getCarrinho());
        this.carrinho = carrinho;
        this.cliente = cliente;
    }

    public void recebeCarrinho() {
        double valorCarrinho = carrinho.getValorTotal();
        double valorCliente = cliente.getDinheiroTotal();
        if(valorCarrinho > valorCliente) {
            carrinho.esvaziarCarrinho();
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.cliente.efetuarPagamento(valorCarrinho);
        this.cliente.addNfe(this.notaFiscal);
        this.notaFiscal.imprimirNota();
    }


}