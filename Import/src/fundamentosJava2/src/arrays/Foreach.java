package arrays;

// foreach = pra cada elemento ele ira fazer um laço de repetição sem o usuário necessitar controlar isso a partir de uma variável
public class Foreach {

    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};
        //forma for convencional
        for (int i = 0; i < notas.length ; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        //foreach
        for(double nota: notas) {
            System.out.print(nota + " ");
        }
    }
}
