public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int numPessoas;

    Elevador(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public void Entrar(){
        if(this.capacidade > this.numPessoas){
            this.numPessoas = this.numPessoas + 1;
        }else {
            System.out.println("Oops... O elevador está lotado!");
        }
    }

    public void Sair(){
        if(this.numPessoas>0){
            this.numPessoas = this.numPessoas-1;
        }else {
            System.out.println("O elevador está vazio");
        }
    }

    public void Sobe(){
        if(this.andarAtual<this.totalAndares){
            this.andarAtual = this.andarAtual+1;
        }else{
            System.out.println("O elevador está no último andar");
        }
    }

    public void Desce(){
        if(this.andarAtual>0){
            this.andarAtual = this.andarAtual-1;
        }else{
            System.out.println("O elevador está no térreo");
        }
    }

    public void Status(){
        System.out.println("Existem " + this.numPessoas + " pessoas dentro do elevador." +
                " O elevador se encontra no andar " +
                "de número " + this.andarAtual);
    }
}