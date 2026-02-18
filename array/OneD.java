import java.util.Scanner;

public class OneD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the array value of "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("array values are ");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
