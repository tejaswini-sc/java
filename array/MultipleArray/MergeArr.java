package array.MultipleArray;
import java.util.Scanner;

public class MergeArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int n1=scanner.nextInt();
        int b[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=scanner.nextInt();
        }
        int k=0;
        int res[]=new int[n+n1];
        for(int i=0;i<n;i++)
        {
            res[k]=a[i];
            k++;
        }
        for(int i=0;i<n1;i++)
        {
            res[k]=b[i];
            k++;
        }
        System.out.print("Merged array: ");
        for(int i=0;i<n+n1;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    
}
