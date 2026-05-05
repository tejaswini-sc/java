import java.util.TreeSet;
import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}