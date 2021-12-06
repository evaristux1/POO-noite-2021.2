import java.math.BigInteger;
import java.util.ArrayList;

public class Cliente {
    private final String nome;
    private final BigInteger cpf;
    private ArrayList<nfe> nfesCliente;
    private double dinheiroTotal;

    public Cliente(String nome, BigInteger cpf,  double totalDinheiro) {
        this.nfesCliente = new ArrayList<>();
        this.nome = nome;
        this.cpf = cpf;
        this.dinheiroTotal = totalDinheiro;
    }

    public void efetuarPagamento(double totalDinheiro) {
        if(totalDinheiro <= 0) {
            throw new Error("Valor inválido,O valor deve ser maior que zero");
        }
        this.dinheiroTotal -= totalDinheiro;
    }

    public String getNome() {
        return nome;
    }

    public BigInteger getCpf() {
        return cpf;
    }

    public ArrayList<nfe> getCompras() {
        return nfesCliente;
    }

    public void addNfe(nfe notaFiscal) {
        this.nfesCliente.add(notaFiscal);
    }

    public double getDinheiroTotal() {
        return dinheiroTotal;
    }

}