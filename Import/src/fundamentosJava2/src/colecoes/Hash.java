package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);

        // HashTable é sincronizado, HashMap não é sincronizado
        // HashTable não aceita valores nulos, HashMap aceita
        // HashTable é mais lento que o HashMap
        // HashTable é mais seguro que o HashMap
        // HashTable é mais antigo que o HashMap
        // HashTable é thread-safe, HashMap não é thread-safe
        // HashTable é mais lento que o HashMap
        // HashTable é mais seguro que o HashMap
        // HashTable é mais antigo que o HashMap
        // HashTable é thread-safe, HashMap não é thread-safe
    }
}
