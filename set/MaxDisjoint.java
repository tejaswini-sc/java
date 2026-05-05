import java.util.*;

public class MaxDisjoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                // duplicate found → form a group
                count++;
                set.clear(); // start new group
            } else {
                set.add(arr[i]);
            }
        }

        System.out.println(count);
    }
}