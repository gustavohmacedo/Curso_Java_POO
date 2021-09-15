package secao_6_memoria_arrays_e_listas.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("-----------------------------");
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        for (String elemento : list) System.out.println(elemento);
        System.out.println("\nTamanho da List: " + list.size());

        System.out.println("-----------------------------");

        System.out.println("Removendo nome da lista que iniciam com a letra 'M' ");
        list.removeIf(nome -> nome.charAt(0) == 'M');
        for (String elemento : list) System.out.println(elemento);

        System.out.println("-----------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------------------------");


        System.out.println("Retornar lista de nomes que iniciam com a letra 'A' ");
        List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());
        for (String elemento : result) System.out.println(elemento);

        System.out.println("-----------------------------");

        System.out.println("Retornar lista de nomes, caso iniciar com a letra 'J' ");
        String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);


    }
}
