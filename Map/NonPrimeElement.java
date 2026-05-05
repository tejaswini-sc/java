import java.util.*;

public class NonPrimeElement {

    public static boolean checkPrime(int n)
    {
        if(n <= 1)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                int count = map.get(a[i]);
                map.put(a[i], count + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (int key : map.keySet()) {
            int value = map.get(key);

            if ((!checkPrime(key)) && value == 1) {
                System.out.println(key);
            }
        }

    }
}