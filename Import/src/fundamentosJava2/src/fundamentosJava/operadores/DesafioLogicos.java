package fundamentosJava.operadores;

import com.sun.jdi.connect.Connector;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        //Trabalho na terça (V ou F)
        //Condiçao 1 - Se um trabalho der certo compra tv 32"
        //Condiçao 2 - Se os dois trabalhos derem certo compra tv 50"
        //Condiçao 3 - Se um trabalho der certo compra tv e toma sorvete"
        //Condiçao 4 - Se não trabalhar fica em casa com fome"

        boolean trabalho1 = true;
        boolean trabalho2 = false;
        //Operador Binário
        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        //Operador Unário
        boolean maisSaudavel = !comprouSorvete;
        //Operador Binário
        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);

        //Operador Unário
        System.out.println("Mais saudável? " + maisSaudavel);

    }
}
