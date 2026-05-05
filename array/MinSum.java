import java.util.Scanner;

public class MinSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int minSum=Integer.MAX_VALUE;
        int index1=0;
        int index2=1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]<minSum)
                {
                    minSum=a[i]+a[j];
                    index1=i;
                    index2=j;
                }
            }
        }
        System.out.print(a[index1]+" "+a[index2]);
        
    }
}