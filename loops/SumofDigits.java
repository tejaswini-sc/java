
import java.util.Scanner;

public class SumofDigits {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = findSumOfDigits(num);
        System.out.println(sum);
    }

    public static int findSumOfDigits(int num) {
        // Your logic here
        int count=0;
        int sum=0;
        while(num>0)
        {
        count++;        
        num=num/10;
        }
        return count;
    }
            

}
