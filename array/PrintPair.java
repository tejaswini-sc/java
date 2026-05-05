import java.util.*;
public class PrintPair {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
    
}
