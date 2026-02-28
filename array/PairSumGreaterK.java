import java.util.Scanner;

public class PairSumGreaterK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size");
        int n = scanner.nextInt();
        int a[]=new int[n];
        System.out.println("enter array values");
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.println("enter k value");
        int k=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]>k)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}