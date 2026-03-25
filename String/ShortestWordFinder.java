import java.util.Scanner;

public class ShortestWordFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] ar = s.split(" ");

        int min = Integer.MAX_VALUE;
        String small = "";
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].length() < min) {
                min = ar[i].length();
                small = ar[i];
            }
        }

        System.out.println(small);

    }
}