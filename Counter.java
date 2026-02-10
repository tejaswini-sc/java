import java.util.Scanner;

class Counter{
    static int fact(int n)
    {
        int res = 1;
        for(int i=1;i<=n;i++)
        {
            res=res*i;
        }
        return res;
    }
    static int countDig(int n)
    {
        int count=0;
        while (n!=0) {
            n=n/10;
            count++;
        }
        return count;
    }

    static int avg(int a, int b, int c)
    {
     int add =a+b+c;
     int avg=add/3;
     return avg;   
    }
    static int sumofodd(int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int res=countDig(n);
        int res1 = fact(n);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(avg(a, b, c));
        System.out.println(sumofodd(n));

    }

}