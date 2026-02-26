import java.util.Scanner;

public class LargsetCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}