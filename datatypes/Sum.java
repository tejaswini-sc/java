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

    public static void main(String[] args) {
        sum();
        System.out.println();
        product();
        dolar2rupee();
        // recctangle();

    }
}
