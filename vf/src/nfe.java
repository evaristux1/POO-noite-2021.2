import java.util.ArrayList;
import java.util.UUID;

public class nfe {
    private final ArrayList<Produto> produtosComprados;
    private final String cpf;
    private final String idNFE;
    private double valorCompra;

    public nfe(Cliente cliente, ArrayList<Produto> produtos) {
        this.produtosComprados = produtos;
        this.cpf = cliente.getCpf();
        this.idNFE = UUID.randomUUID().toString();
    }

    public void imprimirNota() {
        System.out.println("###########MERCADINHO7########");
        System.out.println("Ordem: " + this.idNFE);
        System.out.println("CPF: " + this.cpf);
        System.out.println("COMPRA: ");
        double precoTotal = 0;
        for(Produto item : this.produtosComprados) {
            if(item != null) {
                System.out.println("Produto: " + item.getNome() +" -------- "+ item.getPreco());

                precoTotal += item.getPreco();
            }
        }
        System.out.println("TOTAL: " + precoTotal);
    }

    @Override
    public String toString() {
        return idNFE;
    }
}