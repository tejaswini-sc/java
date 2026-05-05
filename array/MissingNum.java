import java.util.Scanner;

public class MissingNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int res=findMissingElement(a);
        System.out.print(res);
    }

    public static int findMissingElement(int[] a) {
       int n=a.length+1;
       int sum=n*(n+1)/2;
       int arrSum=0;
       for(int i=0;i<a.length;i++)
       {
            arrSum+=a[i];
       }
       return sum-arrSum;
    }
}