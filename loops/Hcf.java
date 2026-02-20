import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        for(int i=n;i>1;i--)
        {
            if(n%i==0 || m%i==0)
            {
                System.out.print(i);
                break;
            }
            
        }
    }
}