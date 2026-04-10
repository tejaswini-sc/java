package Collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l = new LinkedList<Integer>();

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            l.add(a[i]);   
        }
        l.sort(null);

        System.out.println(l.get(3));
    }
}