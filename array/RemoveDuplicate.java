import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("count 0");
            return;
        }

        int k = 1;  // first element is always unique

        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                a[k] = a[i];  // place unique element
                k++;
            }
        }

        System.out.println("count " + k);
        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }
}