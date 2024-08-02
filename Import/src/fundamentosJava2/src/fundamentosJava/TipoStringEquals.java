package fundamentosJava;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" ==  "2");

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s)); //.equals compara os contudos e não entrar em qualquer outra questão interna da linguagem

        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.next();
        System.out.println("2" == s2);
        System.out.println("2".equals(s2.trim())); //use o equals para comparar strings

        entrada.close();
    }
}
