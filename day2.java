import java.nio.channels.Pipe.SourceChannel;
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
    static void removelastdigit(int n)
    {
        n=n/10;
        System.out.println(n);

    }
    static void twodigits(int n)
    {
        if(n>=10 && n<100)
        {
            System.out.println("Number is 2 digit");
        }
        else 
        {
            System.out.println("number is not 2 digit");
        }
    }
    static void endzero(int n)
    {
        if(n%10==0){
            System.out.println("end with zero");
        }
        else{
            System.out.println("not");
        }
    }
    public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
      int n=scan.nextInt();
      evenodd(n); 
      System.out.println();
      removelastdigit(n); 
      twodigits(n);
      System.out.println();
      endzero(n);
     
    } 
}
