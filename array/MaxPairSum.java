import java.util.Scanner;

public class MaxPairSum {

    public static int findSecondSmallest(int[] a) {
        // Write your code here
        int min1=Integer.MIN_VALUE;
        int min2=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>min1)
            {
                min2=min1;
                min1=a[i];
            }
            else if(a[i]>min2)
            {
                min2=a[i];
            }
        }
        return min1+min2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.print(findSecondSmallest(a));
        
    }
}