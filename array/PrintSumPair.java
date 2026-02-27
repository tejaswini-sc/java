import java.util.*;
public class PrintSumPair {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;i++)
            {
                if(a[i]+a[j]==k)
                    System.out.print(a[i]+" "+a[j]);
            }
        }
    }    
}
