package array;

import java.util.Scanner;

public class Start2Mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("values");
        for(int i=0;i<n/2;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
