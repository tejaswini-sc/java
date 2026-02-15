import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5];
        for(int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        int max=a[0];
        for(int j=0;j<5;j++)
        {
            if(a[j]>max)
            {
                max=a[j];
            }
        }
        System.out.println(max);
    }
}
