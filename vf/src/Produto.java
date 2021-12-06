import java.util.UUID;

public class Produto {
    private final String nome;
    private final String marca;
    private final String codigoDeBarras;
    private final Categorias categorias;
    private int qtdeDisponivel;
    private double preco;
    private String categoria;

    public Produto(String nome, String marca,int qtdeDisponivel, double preco, int codigoCategoria) {
        this.categorias = new Categorias();
        this.nome = nome;
        this.marca = marca;
        this.qtdeDisponivel = qtdeDisponivel;
        this.preco = preco;
        this.codigoDeBarras = UUID.randomUUID().toString();
        this.categoria = categorias.defineCategoria(codigoCategoria);
    }


    public void pegaProduto(int quantidade) {
        if(quantidade > qtdeDisponivel) {
            throw new Error("O Produto " + this.nome +" está em falta!");
        }
        this.qtdeDisponivel -= quantidade;
    }

    public void devolveProduto(Number quantidade) {
        this.qtdeDisponivel += (int) quantidade;
    }
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
        public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }
}
