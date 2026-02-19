import java.util.Scanner;

public class Studentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size");
        int n =sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the"+(i+1)+ "st student age");
            a[i]=sc.nextInt();
        }
        System.out.println("do you want to print student age");
        String choice = sc.next();
        if(choice.equals("Yes"))
        {
            for(int i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
        }
        else
        {
            System.out.println("thank u for visiting");
        }   
    }
}
