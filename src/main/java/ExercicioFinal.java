
// 1- Crie uma lista e execute as seguintes operações:
// Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
// Navegue na lista exebindo cada nome no console
// Substitua o nome carlos por Roberto
// retorne o nome da posição 1
// remova o nome da posição 4
// remova o nome joão
// retorne a quantidade de itens na lista
// verifique se o nome juliano existe na lista
// crie uma nova lista com os nomes: ismael e rodrigo, adicione todos os itens na primeira lista criada.
// ordene os itens da lista por ordem alfabética
// verifique se a lista está vazia

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome: nomes){
            System.out.println(nome);
        }

        nomes.set(3, "Roberto");

        nomes.remove(4);

        nomes.remove("João");

        System.out.println(nomes.size());

        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        nomes.add(nomes2.toString());

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(nomes.isEmpty());



    }
}
