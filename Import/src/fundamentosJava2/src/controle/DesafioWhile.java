package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quabtidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            System.out.print("Informe a nota (ou -1 para sair: ");
            nota = entrada.nextDouble();

          if(nota <= 10 && nota >= 0) {
              total += nota;
              quabtidadeDeNotas++;
          } else if(nota != -1) {
              System.out.println("Nota inválida!!!");
          }
        }

        //Calcular média
        double media = total / quabtidadeDeNotas;
        System.out.println("Média = " + media);

        entrada.close();
    }
}
