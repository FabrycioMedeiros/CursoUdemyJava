package fundamentosJava;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.1f%n", 1234.5678);

        int a = 3;
        /*Scanner entrada = new Scanner(System.in);
        //tipo nome = determinado valor
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite seu idade: ");
        int idade = entrada.nextInt();
        System.out.println("\n\nNome = " + nome + " " + sobrenome + " " + idade + " " + "anos");
        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close(); */


        Scanner teclado = new Scanner(System.in);
        //Uso do nextInt e nextLine
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        teclado.close();
        //uso do entrada.close(); para encerrar o processo
        //%s representa string, %f ponto flutuante, %d valores inteiros
        //return ResponseEntity.ok(response);
        //public ResponseEntity<MeuResponse> meuMetodo() {}


    }
}