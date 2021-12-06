public class Main {
    public static void main(String[] args) {
        Produto Mingal = new  Produto("Mingal","Nestlé",5, 1000,10);
        Cliente cliente1 = new Cliente("Dante", "9696969-69", 10);

        CarrinhoCompras carrinho = new CarrinhoCompras();
        System.out.println("Saldo: " + cliente1.getDinheiroTotal());
        System.out.println("Mingal qtd: " + Mingal.getQtdeDisponivel());

        carrinho.colocaProdutoCarrinho(Mingal, 1);

        Caixa caixa = new Caixa(cliente1, carrinho);
        try{
            caixa.recebeCarrinho();
        } catch (Exception e) {
            System.out.println("Exceção: "+ e.getMessage());
        }
        System.out.println("NotasFiscais do cliente "+ cliente1.getNome() + ": " + cliente1.getCompras());
    }
}