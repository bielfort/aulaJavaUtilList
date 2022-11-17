package queue;

// Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
// Navegue na fila exibindo cada nome no console
// Retorne o primeiro item da fila, sem remove-lo
// Retorne o primeiro item da fila, removendo o mesmo
// Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
// Retorne o tamanho da lista
// Verifique se a lista está vazia
// Verifique se o nome Carlos está na lista

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFinalQueue {
    public static void main(String[] args) {
        Queue<String> novaLista = new LinkedList<>();

        novaLista.add("Juliana");
        novaLista.add("Pedro");
        novaLista.add("Carlos");
        novaLista.add("Larissa");
        novaLista.add("João");

        System.out.println(novaLista);

        String primeiroCliente = novaLista.element();

        System.out.println(primeiroCliente);
        System.out.println(novaLista);

        String removePrimeiroCliente = novaLista.poll();
        String primeiroCliente2 = novaLista.peek();

        System.out.println(removePrimeiroCliente);
        System.out.println(novaLista);
        System.out.println(primeiroCliente2);

        novaLista.add("Daniel");
        System.out.println(novaLista);
        System.out.println(novaLista.size());
        System.out.println(novaLista.isEmpty());

        boolean contemCarlos = novaLista.contains("Carlos");
        System.out.println(contemCarlos);


    }

}

