package fundamentosJava;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        s = s.toUpperCase();
        s = "Bom dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Bom"));
        System.out.println(s.startsWith("bom"));
        System.out.println(s.toLowerCase().startsWith("bom"));
        System.out.println(s.endsWith("dia"));
        System.out.println(s.length());
        System.out.println(s.equals("bom dia"));
        System.out.println(s.equals("Bom dia"));
        System.out.println(s.equalsIgnoreCase("bom dia"));

        var nome = "Pedro";
        var sobrenome =  "Santos";
        var idade = 33;
        var salario = 1234.45;

        System.out.println("Nome:" + nome + "\nSobrenome:" + sobrenome + " " + "Idade:" + idade + "\nSalario:" + salario + "\n\n");
        //printf
        System.out.printf("\nO senhor %S %S tem %d anos, e recebe um salário de R$%.2f. ", nome, sobrenome, idade, salario);
        String frase = String.format("\nO senhor %S %S tem %d anos, e recebe um salário de R$%.2f. ", nome, sobrenome, idade, salario);
        System.out.printf(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
