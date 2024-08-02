package classe;

public class ValorNulo {

    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!!")); //Não terá problemas pois temos um objeto String criado

        //String s2; //erro de compilação variavel local s2 não localizada
        //System.out.println(s2.concat("????"));

        String s2 = Math.random() > 0.5 ? "Opa" : null;;

        if (s2 != null) {

            System.out.println(s2.concat("????")); //erro de tempo de execução - erro de runtime(NullPointerException)
            // erro ocorre quando temos uma variável nula e tentamos acessar algum atribudo desta variável nula.
        }

        Data d1  = Math.random() > 0.5 ? new Data() : null; //atribuição ternária

        if (d1 != null) {
            d1.mes = 3;
            System.out.println(d1.obterDataFormatada());
        }
    }
}
