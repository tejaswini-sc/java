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

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int res=countDig(n);
        int res1 = fact(n);
        System.out.println(res);
        System.out.println(res1);


    }

}