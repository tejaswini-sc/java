import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[] =new int[n];
        System.out.println("enter values");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        int avg=sum/n;
        System.out.println(avg);
    }
}
