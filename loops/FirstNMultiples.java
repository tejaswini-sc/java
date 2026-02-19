import java.util.Scanner;

public class FirstNMultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=1;count<=n;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                count++;
            }
        }
    }
}
