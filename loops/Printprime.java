package loops;

import java.util.Scanner;

public class Printprime {
    
    String printPrimes(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return "not prime";
            }
        }
        return "prime";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(printPrimes(i))
                System.out.println(i);    
        }
        
    }
    
}
