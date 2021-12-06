import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Cliente cliente;
    static List<Produto> produtos = new ArrayList();
    static CarrinhoCompras carrinho = new CarrinhoCompras();

    static void comprarProduto(int index) {
        Produto produto = produtos.get(index);
        System.out.println("CÓD:Nº " + index);
        System.out.println("cod Barras " + produto.codigoDeBarras);
        System.out.println("######################################");
        System.out.println("produto: " + produto.getNome());
        System.out.println("marca: " + produto.getMarca());
        System.out.println("valor unitário: R$" + produto.getPreco());
        System.out.println("qtde em estoque: " + produto.getQtdeDisponivel());
        System.out.println("######################################");
        System.out.println("Quantas unidades do produto você deseja comprar?");
        int qtdeProduto = scanner.nextInt();

        try {
            carrinho.colocaProdutoCarrinho(produto, qtdeProduto);
        } catch (Exception e) {
            System.out.println("Ex" + e.getMessage());
        }

    }

    public static void listarProdutos() {
        if (produtos.size() != 0) {
            System.out.print("PRODUTOS DISPONÍVEIS HOJE\n");
            int index = 0;
            for (Produto produto : produtos) {
                System.out.println("CÓD:Nº " + index);
                System.out.println("cod Barras " + produto.codigoDeBarras);
                System.out.println("######################################");
                System.out.println("produto: " + produto.getNome());
                System.out.println("marca: " + produto.getMarca());
                System.out.println("valor unitário: R$" + produto.getPreco());
                System.out.println("qtde em estoque: " + produto.getQtdeDisponivel());
                System.out.println("######################################");
                index++;
            }
            System.out.println("\n\nDigite o código do produto que você deseja comprar:");
            int indice = scanner.nextInt();
            if (indice < 0 || indice > produtos.size() + 1) {
                System.out.println("\n\nProduto inexistente, vamos de novo: \n");
                listarProdutos();
            } else {

                comprarProduto(indice);
            }

        } else {
            System.out.print("NENHUM PRODUTO DISPONÍVEL");

        }

    }

    public static void registrarCliente() {

        System.out.println("Cadastro de cliente");
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Olá " + nomeCliente + "! Digite agora seu CPF (somente numeros)");
        BigInteger cpf = scanner.nextBigInteger();
        System.out.println("Maravilha, agora diz pra gente quanto você tem ai pra gastar hoje?");
        Double totalDinheiro = scanner.nextDouble();
        System.out.println("Só para confirmar:");
        System.out.println("nome: " + nomeCliente + "\nCPF: " + cpf + "\ncapital:R$ " + totalDinheiro + "\n correto?");
        System.out.println("1 para sim qualquer outro numero para não");
        int correto = scanner.nextInt();
        if (correto == 1) {
            cliente = new Cliente(nomeCliente, cpf, totalDinheiro);
        } else {
            System.out.println("Vamos tentar novamente?");
            registrarCliente();
        }

    }

    public static void menuInicial() {

        System.out.println("Agora que você já esta cadastrado, o que você deseja fazer?");
        System.out.println("1 - Ver minhas notas fiscais");
        System.out.println("2 - Comprar");
        System.out.println("3 - Ver Carrinho");
        System.out.println("4 - Finalizar compras");

    }

    public static void visualizarCarrinho() {
        int index = 0;
        ArrayList<Produto> produtosComprados = carrinho.getCarrinho();
        if (produtosComprados.size() != 0) {
            for (var produto : carrinho.getCarrinho()) {
                System.out.println("CÓDIGO Nº: " + index);
                System.out.println("Produto: " + produto.getNome());
                System.out.println("TOTAL: " + carrinho.getValorTotal());
                index++;
            }
            System.out.println("Deseja alterar algo do carrinho?:");
            System.out.println("1 -sim \n2 - não");
            int alterar = scanner.nextInt();
            if (alterar == 1) {
                System.out.println("Se você deseja remover algum item , digite o código do item:");
                System.out.println("Se  quiser esvaziar o carrinho, digite 99");
                int opcao = scanner.nextInt();

                if (opcao == 99) {
                    carrinho.esvaziarCarrinho();

                } else {
                    ArrayList<Produto> produtos = carrinho.getCarrinho();
                    carrinho.removeProdutoCarrinho(produtos.get(opcao));
                }
            } 

        } else {
            System.out.println("Carrinho Vazio");

        }

    }

    public static void main(String[] args) {
        produtos.add(new Produto("Arroz", "101", 10, 6.50, 1));
        produtos.add(new Produto("Feijão", "barnabé", 10, 7.50, 1));
        produtos.add(new Produto("Picanha", "Friboi", 2, 26, 2));
        produtos.add(new Produto("Suco de Laranja", "DellVale", 3, 9.35, 1));

        System.out.println("##########BEM VINDO AO MERCADINHO7##########");
        System.out.println("Para lhe atender melhor, vamos fazer algumas perguntas certo?");

        registrarCliente();
        int opcao;
        do {
            menuInicial();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Notas Fiscais do cliente " + cliente.getNome() + ": " + cliente.getCompras());

                    break;
                case 2:
                    listarProdutos();

                    break;
                case 3:
                    visualizarCarrinho();
                    break;
                case 4:
                    Caixa caixa = new Caixa(cliente, carrinho);
                    try {
                        caixa.recebeCarrinho();
                    } catch (Exception e) {
                        System.out.println("!!!Ex " + e.getMessage());
                    }
                    break;
                default:
                    menuInicial();
                    break;

            }
        } while (opcao != 0);

    }

}