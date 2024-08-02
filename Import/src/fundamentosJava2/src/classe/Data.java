package classe;

public class Data {

    int dia;
    int mes;
    int ano;
//adicionando métodos a classe Data

    Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1 ,1, 1970); //Usando this como método, a partir de um construtor, podemos chamar um construtor.

        //Valores padrões dado quando não definimos variaveis locais
        //int, byte, short, long -> 0
        //float, double -> 0
        //boolean -> false
        //char -> '\u0000
        //Objetos -> null
        //constantes devem ser inicializadas com valor padrão, caso contrário, devem ser alocadas dentro do construtor!
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano; //o uso do this é para referenciar o objeto atual

    }
    String obterDataFormatada() {
        final String formato = "%d/%d/%d"; //Variavel Local - Quando definimos uma variável dentro do método
        return String.format(formato, this.dia, mes, ano);
    }
    void imprimirDataFormatada() {

        System.out.println(obterDataFormatada());
    }
}
