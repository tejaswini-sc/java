import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintUniqueString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String s[] = new String[n];

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length; i++) {
            s[i] = scanner.nextLine();
            set.add(s[i]);
        }

        for (String x : set) {
            System.out.print(x + " ");
        }
    }
}