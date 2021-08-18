public class Main {
    public static void main(String[] args) {

        Data data1 = new Data();
        data1.setDia(16);
        data1.setMes(8);
        data1.setAno(2021);

        Data data2 = new Data();
        data2.setDia(15);
        data2.setMes(8);
        data2.setAno(2021);


        System.out.println("O valor da data 1º é: " + data1.getDia() +"/" + data1.getMes() + "/" + data1.getAno());
        System.out.println("O valor da data 2º é: " + data2.getDia() +"/" + data2.getMes() + "/" + data2.getAno());
        System.out.println(data1.compare(data2));
    }
}