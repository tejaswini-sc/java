package array.MultipleArray;
import java.util.Scanner;

public class RearrangeNegPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int j=0;
     
       for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
            {
                int temp=a[i];
                int k=i;
                while(k>j)
                {
                    a[k]=a[k-1];
                    k--;
                }
                a[j]=temp;
                j++;        
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }

}




    