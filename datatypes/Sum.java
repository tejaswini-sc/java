package datatypes;

import java.util.Scanner;

public class Sum {

    static void sum(){
        Scanner scan = new Scanner(System.in); 
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sum();
    }
}
