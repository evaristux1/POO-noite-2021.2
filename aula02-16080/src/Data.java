public class Data {

    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia){
        //*sombreamento=>
        // declarar um parametro/variavel com o mesmo nome de outra variavel de um escopo superior**
        if(dia > 31 || dia < 0){
            System.out.println("Dia inválido");
        }else {
            this.dia = dia;
        }
    }

    public void setMes(int mes){
        if(mes > 12 || mes < 0){
            System.out.println("Mês inválido");
        }else {
            this.mes = mes;
        }
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public int compare(Data data2){
        if(this.ano>data2.ano){
            return 1;
        }else if(this.ano<data2.ano) {
            return -1;
        }else{
            if(this.mes > data2.mes){
                return 1;
            }else if(this.mes < data2.mes){
                return -1;
            }else {
                if(this.dia > data2.dia){
                    return 1;
                }else if(this.dia < data2.dia){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
}
