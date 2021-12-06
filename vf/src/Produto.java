public class Produto {
    private final String nome;
    private final String marca;
    private final int qtdeDisponivel;
    private final double   preco;
    private final Categorias categorias;
    private String categoria;
    private final String codigoDeBarras;

    public Produto(String nome, String marca, int qtdeDisponivel, double preco, String categoria, String codigoDeBarras) {
        this.categorias = new Categorias();
        this.nome = nome;
        this.marca = marca;
        this.qtdeDisponivel = qtdeDisponivel;
        this.preco = preco;
        this.categoria = categoria;
        this.codigoDeBarras = codigoDeBarras;
    }
}
