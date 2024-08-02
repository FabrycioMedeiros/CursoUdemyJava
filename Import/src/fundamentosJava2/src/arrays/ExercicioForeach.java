package arrays;

import java.util.Arrays;

public class ExercicioForeach {

    public static void main(String[] args) {
        //transformar exemplos em foreach
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA)); //depois da atribuição dos valores

        for (double notaAluno: notasAlunoA) {
            System.out.println(notaAluno);
        }

    }


}
