package loops;
import java.util.Scanner;

public class CmnFactors {

    static int min(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min = min(a, b);
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
            }
        }
    }   
}
