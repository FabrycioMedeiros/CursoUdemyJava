package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        //if(...) sentença; ou {}
        //while(...) sentencá: ou {}
        //for(...; ...; ...)) sentencá;  ou {}

        //do sentença; ou {} while(...);

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar " + "\nas palavras mágicas...");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        entrada.close();
    }
}
