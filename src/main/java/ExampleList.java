import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class ExampleList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Gabriel");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Rafaela");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Gabriel");

        System.out.println(nomes);

        String nome = nomes.get(2);

        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        System.out.println(nome);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temLarissa = nome.contains("Larissa");
        System.out.println(temLarissa);

        boolean temFernando = nome.contains("Fernando");
        System.out.println(temFernando);



        for (String nomeDoItem: nomes) {
            System.out.println(nomeDoItem);
        }

        Iterator<String> iterator = nomes.listIterator();
        while (iterator.hasNext()){
            System.out.println("-------->" + iterator.next());
        }

        nomes.clear();

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

    }
}
