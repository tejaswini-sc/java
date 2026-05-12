
import java.util.*;
public class Aramstrong {
    static int countNumber(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String arggs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp= n;
        int sum=0;
        int count=countNumber(n);
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(digit,count);  
            n=n/10;
        }
        System.out.print(sum);

        if(sum==temp){
            System.out.print("num is armstrong");
        }
        else{
            System.out.print("num is not armstrong");
        }
    }
}