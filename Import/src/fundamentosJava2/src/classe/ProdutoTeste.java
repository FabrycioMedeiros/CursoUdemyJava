package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

       Produto p1 = new Produto("Notebook", 4356.89);
       //p1.nome = "Notebook";
       //p1.preco = 4356.89;
       //p1.desconto = 0.25;

       var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        //usando forma explicita na alteração de produtos
        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.25);
        double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
        //System.out.println(precoFinal2);
        //System.out.println((precoFinal1 + precoFinal2) / 2);
        System.out.printf("Média do carinho = R$%.2f", mediaCarrinho);

    }
}
