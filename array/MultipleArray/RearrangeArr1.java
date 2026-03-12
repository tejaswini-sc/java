package MultipleArray;
import java.util.Scanner;
public class RearrangeArr1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int i=n-1,j=n-1;
        while(i>=0)
        {
            if(a[i]==0)
            {
                i--;
            }
            else
            {
                a[j]=a[i];
                i--;
                j--;
            }
        }
        while(j>=0)
        {
            a[j]=0;
            j--;
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }

}




   