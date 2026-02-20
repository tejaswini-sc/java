
import java.util.Scanner;

public class Printprime {
    
    static String primeOrNot1(int n)
    {
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
            return "prime";
        else
            return "not prime";
    }

    static String primeOrNot2(int n)
    {
        int count =0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==0)
            return "prime";
        else
            return "not prime";
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        String res = primeOrNot2(n);
        System.out.println(res);
       }
}
