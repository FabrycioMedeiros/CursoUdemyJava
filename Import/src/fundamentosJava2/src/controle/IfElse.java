package controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número:");
        int numero = Integer.parseInt(valor);
        /*Estrutura If
        if(numero % 2 == 0) {
            System.out.println("Número par!");
        }
        if (numero == 1) {
            System.out.println("Número impar!");
        }  */
        //Estrutura If/Else
        if(numero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número impar!");
        }

    }
}
