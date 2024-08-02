package classe;

public class Produto  {
    String nome;
    double preco;
    static double desconto = 0.25;

    //aplicando construtor

    // construtor sem parametros
    Produto() {

    }
    // construtor com 1 parametros
    Produto(String nomeInicial) {
        nome = nomeInicial;
    }
    // construtor com vários parametros
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    //add de método a classe
    double precoComDesconto(double descontoDoGerente) {

        return preco * (1 - desconto + descontoDoGerente);
    }

}
