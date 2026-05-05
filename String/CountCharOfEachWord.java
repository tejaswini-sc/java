import java.util.Scanner;

public class CountCharOfEachWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] ar = s.split(" ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ar[i].length()+" ");
        }
    }
}