import java.util.Scanner;
public class Lcf1 {
    static int Min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        int min=Min(n,m);
        for(int i=3;i<min;i++)
        {
            if(n%i==0 && m%i==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
} {
    
}
