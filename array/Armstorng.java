import java.util.*;

public class Armstorng {
    static int countDigit(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    static boolean armStrong(int n)
    {
        int temp=n;
        int count=countDigit(n);
        int arm=0;
        while(n>0)
        {
            int last=n%10;
            arm=arm+(int)Math.pow(last, count);
            n=n/10;
        }
        return arm==temp;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        if(armStrong(n))
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }

    }
    
}
