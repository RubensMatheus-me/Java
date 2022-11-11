package javabasics;
public class FuncoesDeStrings {
    
    public static void main (String[] args) {
        String a = "abcde ABCDE asdc de DFSK"; // variavel string
        String a_minusculo = a.toLowerCase(); // .toLowerCase(); deixa a string toda em minusculo
        String a_maisculo = a.toUpperCase(); // .toUpperCase(); deixa a string toda em maiuscula
        String aTrim = a.trim(); // .trim remove os espaços vazios no final da string
        String aSub = a.substring(2, 8); //.substring(inicio, fim); ex:(2, 8) pega a string depois das 2 primeiras letras, ate a 8 letra
        String aReplace = a.replace('a', 'x'); // .replace troca os caracters 'a' por 'x'
        int x = a.indexOf("de"); // vai achar a posição de caracters que esta o "de" na String
        int z = a.lastIndexOf("de"); // vai achar a ultima posição dos caracteres "de" na String

        String fruits = "apple orange banana";

        String[] vect = fruits.split(" "); //comando .split pega como base um separador e separa ele, aqui no caso usei o separador do espaçamento entre as palavras apple, orange e banana que é o string vazio (" ") e coloquei elas em vetores.

        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println("words: " + word1 + " " + " "+ word2 + " " + word3);

        System.out.println("Original: -" + a + "-");
        System.out.println(".toLowerCase: -" + a_minusculo + "-");
        System.out.println(".toUpperCase: -" + a_maisculo + "-");   
        System.out.println(".trim: -" + aTrim + "-");
        System.out.println(".trim: -" + aTrim + "-");
        System.out.println(".substring: -" + aSub + "-");
        System.out.println(".replace: -" + aReplace + "-");
        System.out.println(".indexOf: -" + x + "-");
        System.out.println(".lastIndexOf: -" + z + "-");



    }

}
