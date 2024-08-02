package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        //d1.dia = 12;
        //d1.mes = 11;
        //d1.ano = 1980;

        Data d2 = new Data(12, 11, 1980);
//        d2.dia = 16;
//        d2.mes = 07;
//        d2.ano = 1983;

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println("A data solicitada é " + d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d2.obterDataFormatada());
        System.out.println(dataFormatada1);
        // metodos em classe data
        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }
}
