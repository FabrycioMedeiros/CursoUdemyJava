package controle;

public class For3 {
    public static void main(String[] args) {
        //para acesso da variavél fora do escopo do laço, temos que coloca-lá fora do FOR
//        int i = 0;
//        for (; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Saiu do for...");
//        System.out.println(i);
//    }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }

        }
    }
}
