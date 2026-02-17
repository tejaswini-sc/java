package loops;

import java.util.Scanner;

public class Num {

    static void evennum(int n)
    {
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    static void tables(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
    static void sumofN(int n)
    {
        int sum=0;
        for(int i =1;i<=n;i++)
        {
            sum=sum+i;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println(i);
        // }
        // evennum(n);
        // tables(n);
        // sumofN(n);
// int x = 10;//11

// int y = 6;

// int res = x++ + ++y + --y + x-- + y++;
//         //10   +  7 +   6  +  11 + 6
// System.out.println(res);
    for(int i=1;i<n;i++)
    {
        System.out.print(2*i);
    }



    }
}
