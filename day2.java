import java.util.Scanner;

public class day2 {
    static void evenodd(int n)
    {
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
      int n=scan.nextInt();
      evenodd(n);  
    } 
}
