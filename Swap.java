import java.util.Scanner;

public class Swap {
    static void evenodd(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    static void reverse(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("reversed num"+rev);
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        evenodd(a);
        reverse(b);
        System.out.printf("befor swapa= %d b=%d\n",a,b);
        int temp=a;
        a=b;
        b=temp;
        System.out.printf("after swapa= %d b=%d\n",a,b);
        System.out.println("sqrt of a"+Math.sqrt(a));
    }
}
