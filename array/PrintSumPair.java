import java.util.*;
public class PrintSumPair {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n value");
        int n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.println("enter k value");
        int k=scanner.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==k)
                    System.out.println(a[i]+" "+a[j]);
            }
        }
    }    
}
