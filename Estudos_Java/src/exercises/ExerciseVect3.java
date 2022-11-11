package exercises;
import java.util.Scanner;
import entities.EmptyRooms;
import java.util.Locale;


public class ExerciseVect3 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many room will be rented? ");
        int sizeRoom = sc.nextInt();
        int size = 10;
        EmptyRooms[] vect = new EmptyRooms[size];

        for (int i = 0; i < sizeRoom; i++) {
            System.out.printf("%nRent: %d%n", i + 1);
            sc.nextLine();

            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Gmail:");
            String gmail = sc.nextLine();
            System.out.print("Room:");
            int room = sc.nextInt();
            vect[room] = new EmptyRooms(name, gmail, room);
        }

        System.out.println("Busy room");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getGmail());
            }
        }
        
        sc.close(); 
    }
}
