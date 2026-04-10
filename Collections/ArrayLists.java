package Collections;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<Integer>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            l.add(i);
        }
        System.out.println(l);
    }
}
