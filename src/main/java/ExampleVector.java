import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //Adiciona 4 esportes no vetor

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tênis");
        esportes.add("Handebol");
        System.out.println(esportes);
        // Altera o valor da posição 2 do vetor

        esportes.set(2, "Ciclismo");
        System.out.println(esportes);

        // Remove o esporte da posição 2

        esportes.remove(2);
        System.out.println(esportes);

        // retorna o primeiro item do vetor

        System.out.println(esportes.get(0));

        //navega nos esportes

        for(String esporte: esportes){
            System.out.println(esporte);
        }


    }
}
