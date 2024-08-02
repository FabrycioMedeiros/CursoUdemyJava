package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "primeiro treino":
                System.out.println("Vou mostrar esses caras que isso não serve de nada...\n" + "É normal apagar?");
            case "branca":
                System.out.println("É normal doer até a alma?...");
            case "branca 1 graus":
                System.out.println("Amanhã vou pro shopping de faixa...");
            case "branca 2 graus":
                System.out.println("Vou usar a posição do youtube em todo mundo...");
            case "branca 3 graus":
                System.out.println("Tô quase entrando pro sindicato dos azuis...");
            case "branca 4 graus":
                System.out.println("Não entendo por quê o mestre não me dá a preta...");
            case "azul":
                System.out.println("Sou foda! Mas por quê tenho a sensação que só to apanhando?...");
            case "roxa":
                System.out.println("Chego atrasado, e só quero pegar o bola do treino...");
            case "marrom":
                System.out.println("Cheirando a preta, mas ainda sofro bulling...");
            case "preta":
                System.out.println("Sei executar vários movimentos e finalizações...");
            default:
                System.out.println("Quero treinar Jiu-Jitsu!");


        }

    }
}
