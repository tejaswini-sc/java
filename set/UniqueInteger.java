import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        // Use generics properly
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}