package javabasics;

public class ForEach {
    public static void main (String[] args) {
        /*
        for (tipo apelido: colecao) 
            <comando1>
            <comando2>
        */
        String[] vect = new String[] {"Maria", "Joao", "Gabriel"};
        for (String nomes: vect) {
            System.out.println(nomes);
        }
    }
}
