import java.util.*;
public class PrintAllSubArr {
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int len=1;len<=n;len++)
        {    
            for(int i=0;i<=n-len;i++)
            {
                for(int j=i;j<i+len;j++)
                {
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }
        }
    }  
}
