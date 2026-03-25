import java.util.Scanner;

public class ReverseEachWord {

    static String reverse(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] s = string.split(" ");

        for (int i = 0; i < s.length; i++) {
            System.out.print(reverse(s[i]) + " ");
        }

        scanner.close();
    }
}