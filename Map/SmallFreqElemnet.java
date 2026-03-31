import java.util.*;

public class SmallFreqElemnet {
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
        int min = 0;
        int num = a[0];

        for (int key : map.keySet()) {
            int value = map.get(key);

            if (value > min) {
                min = value;
                num = key;
            }
        }

        System.out.print(num);
    }
}