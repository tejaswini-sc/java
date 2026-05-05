package MultipleArray;

import java.util.Scanner;

public class RepeatedElement {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
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
        int i=0,j=0;
        while(j<b.length && i<a.length)
        {
            if(a[i]==b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i]>b[i])
            {
                j++;
            }
            else{
                i++;
            }
        }
    
    }    
}

