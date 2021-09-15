
public class CaixaEletronico {


    ContaCorrente[] contasLocais = new ContaCorrente[10];

    void setContasLocais(ContaCorrente contaCorrente){
        if(contasLocais.length <10){
            int indice= 0;
            for (int i = 0; i < contasLocais.length; i++) {
                indice =i +1;
            }
            contasLocais[indice]=contaCorrente;
        }else{
            System.out.println("Numero máximo de contas para este caixa eletrônico atingido!");
        }
    }



}
