import java.util.Scanner;
public class SwapindexEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int []a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Before Swapping:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i=i+2)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp; 
        }
        System.out.println("After Swapping:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}