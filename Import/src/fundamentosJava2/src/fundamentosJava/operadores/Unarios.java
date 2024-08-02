package fundamentosJava.operadores;

public class Unarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio...");
        System.out.println(++a == b--); //neste caso só ocorre a igualdade por o a incrementar e associar a igualdade de b, gerando true, após isso e que será decrementado o valor de b, que nào sendo uma resposta correta.
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
