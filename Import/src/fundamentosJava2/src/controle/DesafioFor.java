package controle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for(int i = 1; i <= 10; i++) {
            System.out.println(valor);
            valor += "#";
        }

//        //Versão do desafio
//        // Não pode ter valor numérico para controlar o laço
        for(String v = "#"; !v.equals("##########"); v += "#") {
            System.out.println(v);
        }

    }
}
