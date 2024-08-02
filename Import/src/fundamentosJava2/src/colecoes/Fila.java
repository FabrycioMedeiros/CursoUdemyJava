package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); //retorna false
        fila.offer("Bia"); //Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peek e Element -> obter o proximo elemento da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia(comentar as filas para vizualizar)!
        System.out.println(fila.peek()); //retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lança uma exceção
        System.out.println(fila.element());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        //Pool e Remove -> obter o proximo elemento da fila e remove
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); //retorna exceção pois a lista esta vazia do tipo NoSuchElementException

        //fila.size(); conta tamanho da fila
        //fila.clear(); limpa a lista da fila
        //fila.isEmpty(); verifica se esta vazia
        //fila.contains(); saber se determinado elemento está contido
        //
    }
}

// Ambos adicionam elementos na fila
//.add() lançará uma exceção caso a fila esteja cheia.
//.offer() retorna falso caso a fila esteja cheia.