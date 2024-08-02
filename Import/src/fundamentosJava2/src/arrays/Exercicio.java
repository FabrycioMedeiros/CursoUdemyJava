package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];

        System.out.println(Arrays.toString(notasAlunoA)); //antes da leitura dos valores

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA)); //depois da atribuição dos valores

        double totalAlunoA = 0;
        //para percorrer o array
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);
        System.out.println(notasAlunoA[0]); //para pegar valor especifico do array
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);//pega a ultima nota do array
        // System.out.println(notasAlunoA[10]); ERRO por tentativa de acesso do elemento fora do limite do array

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; //caso menos comum de utilização

        double totalAlunoB = 0;

        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }


}
