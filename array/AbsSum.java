package array;
import java.util.*;
public class AbsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                a[i]=-a[i];
                sum=sum+a[i];
            }
            else
            {
                sum=sum+a[i];
            }
            System.out.println(sum);
        }
    }
}
