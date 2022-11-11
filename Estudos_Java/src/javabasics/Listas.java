package javabasics;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main (String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Helon");
        list.add("Sara");
        list.add("Joao");
        list.add("Gabriel");
        list.add("Gustavo");
        list.add("Rubao");
        list.add("Samanta");
        list.add("Geraldo");
        list.add(0, "Ana");


        System.out.println("Tamanho da lista: " + list.size());
        for (String nomes : list) {
            System.out.println(nomes);
        }
        System.out.println("-------------------Removes----------------");
        list.remove("Helon"); //compara string
        list.remove(3); //posicao

        list.removeIf(x -> x.charAt(0) == 'M'); //predicado, tirar as Strings com M's

        for (String nomes : list) {
            System.out.println(nomes);
        }
        System.out.println("-------------------Finding----------------");
        System.out.println("-------------------Index of Sara----------------");
        System.out.print("Posicao: " + list.indexOf("Sara"));
        System.out.println();


        System.out.println("-------------------Filter----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
        for (String nomes : result) {
            System.out.println(nomes);
        }
        System.out.println();
        System.out.println("----------------Finding for char-----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
        System.out.println(name);

    }
    
}   
