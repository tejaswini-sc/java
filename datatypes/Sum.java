package datatypes;

import java.util.Scanner;

public class Sum {

    static void sum(){
        Scanner scan = new Scanner(System.in); 
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println(a+b);
    }

    static void product()
    {
        Scanner scan =new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a*b*c);
    }

    static void dolar2rupee()
    {
        Scanner sc = new Scanner(System.in);
        int dollar =sc.nextInt();
        double rupee = 82.73;
        System.out.printf("%.4f",dollar*rupee);

    }
    static void recctangle()
    {
        Scanner sc =new Scanner(System.in);
        int len=sc.nextInt();
        int wid = sc.nextInt();
        int perimeter = 2*(len+wid);
        System.out.println(perimeter);
   }
   static void square()
   {
    Scanner sc = new Scanner(System.in);
    int side =sc.nextInt();
    System.out.println(4*side);
   }
   static void circle()
   {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    double pi =3.142;
    System.out.printf("%.4f",pi*r*r);
   }
    public static void main(String[] args) {
        System.out.println("Sum of Two numbers");
        sum();
        System.out.println("product of three numbers");
        product();
        System.out.println("dollar to rupees");
        dolar2rupee();
        System.out.println("rectangle perimeter");
        recctangle();
        System.out.println("square perimeter");    
        square();
        circle();
    }
}
