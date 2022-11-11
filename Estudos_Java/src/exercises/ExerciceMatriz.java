package exercises;
import java.util.Scanner;
import java.util.Locale;


class ExerciceMatriz {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Main diagonal: ");
        for(int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        int count = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    count ++;
                }
            }
        }
        System.out.println();
        System.out.println("Negative Numbers = " + count);
        sc.close();
    }
}