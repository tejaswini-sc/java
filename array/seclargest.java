import java.util.Scanner;

public class seclargest {
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
        int max1=a[0];
        int max2 =a[1];
        for(int i=0;i<n;i++)
        {
            if(max1>max2)
            {
                max1=max2;
                max2=a[i];
            }
        }
        System.out.println("second largest is"+max2);

    }
}
