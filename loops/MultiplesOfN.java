import java.util.Scanner;

public class MultiplesOfN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(i%n==0)
            {
                System.out.println(i);
            }
        }
    }    
}
