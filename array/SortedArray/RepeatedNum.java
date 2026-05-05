package array.SortedArray;

import java.util.Scanner;

public class RepeatedNum {

    public static void PrintCmnNum(int a[],int b[])
    {
        int i=0;
        int j=0;
        while (j<b.length && i<a.length) {
            if(a[i]==b[j])
            {
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if(b[j]>a[i])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        int b[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
        }
        PrintCmnNum(a,b);
    }
}
