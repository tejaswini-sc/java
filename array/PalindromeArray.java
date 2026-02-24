import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (a[i] != a[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome array");
        } else {
            System.out.println("Not a palindrome array");
        }
    }
}