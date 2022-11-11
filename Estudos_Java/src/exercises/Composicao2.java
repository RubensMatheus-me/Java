package exercises;

import java.util.Scanner;

import entities.Post;
import entities.PostComments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

class Composicao2 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        PostComments c1 = new PostComments("Have a nice trip");
        PostComments c2 = new PostComments("Wow that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
            "Traveling to new",
            "I'm Going to visit this wonderful country!",
            12); 
        p1.addComments(c1);
        p1.addComments(c2);

        PostComments c3 = new PostComments("Good Night");
        PostComments c4 = new PostComments("May the force be with you ");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
            "Good night guys",
            "see you tomorrow",
            5); 
        p2.addComments(c3); 
        p2.addComments(c4);

        System.out.println(p1); 
        System.out.println(p2);
        sc.close();
    }
}
