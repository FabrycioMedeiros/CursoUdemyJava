package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(10, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(30, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(10));
        System.out.println(usuarios.containsValue("Rebeca"));
        System.out.println(usuarios.remove(2));
        System.out.println(usuarios.remove(4, "Gui")); //remoção condicional não removeu pois o valor não é Gui
        System.out.println(usuarios.remove(4, "Rebeca")); //remoção condicional removeu pois o valor é Rebeca

        System.out.println(usuarios.get(30));

        //Frmas de percorrer um map, por chave, por valor e por ambos!
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ===> ");
            System.out.println(registro.getValue());
        }
    }
}
