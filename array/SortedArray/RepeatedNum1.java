package SortedArray;

import java.util.Scanner;

public class RepeatedNum1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int n1=scanner.nextInt();
        int b[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=scanner.nextInt();
        }
        int temp=0;
        for(int s=0,e=n-1;s<e;s++,e--)
        {
            temp=a[s];
            a[s]=a[e];
            a[e]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
        }

        int i=0,j=0;
        while(i<n && j<n1)
        {
            if(a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
                
            }
            else if(a[i]<b[j])
            {
                j++;
            }
            else{
                i++;
            }
        }

        
    }
}
