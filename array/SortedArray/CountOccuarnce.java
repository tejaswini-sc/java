package array.SortedArray;

import java.util.Scanner;

public class CountOccuarnce {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        } 
        int count=1;
        for(int i=0;i<n-1;i++)
        {
           if(a[i]==a[i+1])
            {
                count++;
            } 
            else{
                System.out.println(a[i]+"-"+count);
                count=1;
            }
        }  
        System.out.println(a[a.length-1] +"-"+count);
    }
}
