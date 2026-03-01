import java.util.Scanner;

public class PairSumPrime {
    public static boolean checkPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a=new int[n];
        boolean sorted=true;
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(checkPrime(a[i]+a[j]))
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}