import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<5;j++)
        {
            sum=sum+a[j];
        }
        System.out.println("sum of array elements"+sum);
    }
}
