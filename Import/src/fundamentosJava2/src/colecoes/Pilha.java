package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros .push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        // Se fizermos um FOR em cima de uma pilha, ele ira percorrer do topo da pilha até o final
        // Se fizermos um FOR em uma fila, ele irá percorrer do inicio ao término da fila
        // Ele irá exceutar a ordem em que esses arquivos sairem da estrutura. No caso da pilha o ultimo que entrou e na fila o primeiro que entrou.
        for (String livro: livros) {
            System.out.println(livro);
        }

        System.out.println("livros.pop()");
        System.out.println("livros.poll");
        System.out.println("livros.poll");
        System.out.println("livros.poll");
        System.out.println("livros.poll");
        System.out.println("livros.pop");

//        livros.size();
//        livros.clear();
//        livros.isEmpty();
//        livros.contains();
    }
}
