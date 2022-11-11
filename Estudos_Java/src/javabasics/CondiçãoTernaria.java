package javabasics;
public class CondiçãoTernaria {
    /* 
    alternancia, da pra fazer em if e else esse aqui.
    Sintaxe:
    int i = (condição) ? valor_se_verdadeiro : valor_se_falso 
    */
    public static void main (String[] args) {
        //String x = (2 > 4) ? "No" : "Sim"; // isso dará "sim" pois 2 é maior que 4
        //System.out.println("deu: " + x);

        double preco = 13.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }

}
