package fundamentosJava;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        /*primitivos( bite(1 bytes), short(2), int(4), long(8), float(4) e double(8)  para numéricos,
         e char(caracteres) e boolean(true or false)
         */

        // Tudo em Java é objeto, menos os 08 tipos primitivos existentes.
        String s = new String("texto");
        s.toUpperCase();

        //Wrappers são a versào objeto dos tipos primitivos!
        int a = 123;
        System.out.println(a);
    }
}
