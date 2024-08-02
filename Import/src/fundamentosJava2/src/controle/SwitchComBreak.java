package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = scanner.nextInt();
        switch (nota) {
            case 10:
                conceito = "+A";
            break;
            case 9:
                conceito = "A";
                break;
            case 8:
                conceito = "B";
                break;
            case 7:
                conceito = "B-";
                break;
            case 6:
                conceito = "C";
                break;
            case 5:
                conceito = "C-";
                break;
            //Podemos escrever mais de um caso para mesma atribuição.
            case 4: case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                break;
            default:
                conceito = "não encontrado";
        }

        System.out.println("Conceito: " + conceito);

        scanner.close();
    }
}
