import java.util.Scanner;

public class SumDivisible {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int sum=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%3==0 && a[i]%5==0)
                sum=sum+a[i];
        }
        System.out.print(sum);
    }
}
