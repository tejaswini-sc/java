import java.util.Scanner;

public class PrintAllSubSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int len=1;len<=n;len++)
        {
            for(int i=0;i<=n-len;i++)
            {   sum=0;
                for(int j=i;j<i+len;j++)
                {
                    sum=sum+a[j];
                }
                System.out.println(sum);
            }
        }
    }
}
