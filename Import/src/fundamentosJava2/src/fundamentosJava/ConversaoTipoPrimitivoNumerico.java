package fundamentosJava;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // implicita
        System.out.println(a);

        //float b = 1.0F;
        float b = (float) 1.12345888888; // expplicita(CAST)
        System.out.println(b);

        //int c = 4;
        //byte d = c;
        int c = 4;
        byte d = (byte) c; // expplicita(CAST)
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; // expplicita(CAST)
        System.out.println(f);
    }
}
